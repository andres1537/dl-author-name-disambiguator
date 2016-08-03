/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.mongojack.Aggregation;
import org.mongojack.Aggregation.Group;
import org.mongojack.Aggregation.Pipeline;
import org.mongojack.AggregationResult;
import org.mongojack.DBProjection;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.cgomez.dao.AbstractDAO;
import com.cgomez.dao.IDAO;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.model.bibliography.BibliographicCitationDBLP;
import com.cgomez.model.field.BibliographicCitationDBLPField;
import com.cgomez.util.constant.CErrorException;
import com.cgomez.util.constant.Constant;
import com.cgomez.util.mongo.BibliographicCitationAggregationResult;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.QueryOperators;

/**
 * BibliographicCitationDBLPDAOImpl.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@Repository
public class BibliographicCitationDBLPDAOImpl extends AbstractDAO implements IDAO {
    
    /**
     * Find by title.
     *
     * @param tokensTitle the tokens title
     * @return the collection
     * @throws DLDatabaseException the DL database exception
     * @throws DLObjectIdException the DL object id exception
     */
    @SuppressWarnings("unchecked")
    public Collection<BibliographicCitationDBLP> findByTitle(Set<String> tokensTitle) throws DLDatabaseException, DLObjectIdException {
	Collection<BibliographicCitationDBLP> bibliographicCitationsDBLP = new ArrayList<BibliographicCitationDBLP>();
	if (CollectionUtils.isEmpty(tokensTitle)) {
	    return bibliographicCitationsDBLP;
	}
	int i = tokensTitle.size();

	try {

	    while (i > 0 && bibliographicCitationsDBLP.isEmpty()) {
		StringBuffer buffer = new StringBuffer();
		for (String token : ((List<String>) tokensTitle).subList(0, i)) {
		    buffer.append(Constant.QUOTE);
		    buffer.append(token);
		    buffer.append(Constant.QUOTE);
		    buffer.append(Constant.WHITE_SPACE);
		}

		DBObject search = new BasicDBObject(QueryOperators.SEARCH, buffer.toString());
		DBObject query = new BasicDBObject(QueryOperators.TEXT, search);
		bibliographicCitationsDBLP = (Collection<BibliographicCitationDBLP>) (Collection<?>) getCollection()
			.find(query, DBProjection.include(BibliographicCitationDBLPField.TITLE))
			.toArray();
		i--;
	    }

	} catch (IllegalArgumentException e) {
	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
	}

	return bibliographicCitationsDBLP;
    }

    /**
     * Aggregate by field.
     *
     * @param field the field
     * @return the list
     * @throws DLObjectIdException the DBLP object id exception
     */
    public List<BibliographicCitationAggregationResult> aggregateByField(String field) throws DLObjectIdException {
	List<BibliographicCitationAggregationResult> result = null;

	try {

	    Pipeline<?> pipeline = Aggregation.group(field).set("count", Group.count());
	    AggregationResult<BibliographicCitationAggregationResult> aggregationResult = getCollection().aggregate(pipeline,
		    BibliographicCitationAggregationResult.class);
	    result = aggregationResult.results();

	} catch (IllegalArgumentException e) {
	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
	}

	return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cgomez.dao.AbstractDAO#setType()
     */
    @Override
    public void setType() {
	super.type = BibliographicCitationDBLP.class;
    }
}