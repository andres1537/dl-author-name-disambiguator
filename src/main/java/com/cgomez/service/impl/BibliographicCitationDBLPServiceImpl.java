/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.cgomez.dao.impl.BibliographicCitationDBLPDAOImpl;
import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLDuplicateKeyException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.ml.distance.impl.JaccardDistance;
import com.cgomez.model.bibliography.BibliographicCitationDBLP;
import com.cgomez.service.AbstractService;
import com.cgomez.service.IBibliographicCitationDBLPService;
import com.cgomez.util.StringUtils;
import com.cgomez.util.constant.Constant;
import com.cgomez.util.mongo.BibliographicCitationAggregationResult;

/**
 * The Class BibliographicCitationDBLPServiceImpl.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since AuthorDisambiguatorApp-1.0
 */
@Service
public class BibliographicCitationDBLPServiceImpl extends AbstractService implements IBibliographicCitationDBLPService {

    /** The bibliographic citation dao. */
    @Autowired
    private BibliographicCitationDBLPDAOImpl bibliographicCitationDBLPDAO;

    /*
     * (non-Javadoc)
     * 
     * @see com.cgomez.service.IPublicationService#create(com.cgomez.model.dblp.
     * Publication)
     */
    @Override
    public void create(BibliographicCitationDBLP bibliographicCitationDBLP) throws DLBusinessServiceException {
	try {

	    bibliographicCitationDBLPDAO.insert(bibliographicCitationDBLP);

	} catch (DLDuplicateKeyException e) {
	    throw new DLBusinessServiceException("Dupplicate { key: \"" + bibliographicCitationDBLP.getKey() + "\" }", e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IBibliographicCitationDBLPService#retrieveById(java.lang.String)
     */
    @Override
    public BibliographicCitationDBLP retrieveById(String id) throws DLBusinessServiceException {
	try {

	    return (BibliographicCitationDBLP) bibliographicCitationDBLPDAO.findOneById(id);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IBibliographicCitationDBLPService#retrieveMostSimilar(java.lang.String)
     */
    @Override
    public BibliographicCitationDBLP retrieveMostSimilar(String title) throws DLBusinessServiceException {
	BibliographicCitationDBLP mostSimilarBibliographicCitationDBLP = null;

	try {

	    title = StringUtils.removeNonLetterCharacters(title);
	    title = StringUtils.removeStopWords(title);
	    Set<String> words = StringUtils.removeDuplicates(title, Constant.WHITE_SPACE);
	    Set<String> randomWords = StringUtils.chooseRandomWords(words, 1.5);
	    Collection<BibliographicCitationDBLP> bibliographicCitationsDBLPDB = bibliographicCitationDBLPDAO.findByTitle(randomWords);
	    JaccardDistance jaccard = new JaccardDistance();

	    String titleDB = null;
	    double distance = 0d;
	    double minDistance = 1d;
	    if (!CollectionUtils.isEmpty(bibliographicCitationsDBLPDB)) {
		for (BibliographicCitationDBLP bibliographicCitationDBLPDB : bibliographicCitationsDBLPDB) {
		    titleDB = StringUtils.removeNonLetterCharacters(bibliographicCitationDBLPDB.getTitle());
		    titleDB = StringUtils.removeStopWords(titleDB);
		    distance = jaccard.distance(title, titleDB);
		    if (distance <= minDistance) {
			minDistance = distance;
			mostSimilarBibliographicCitationDBLP = bibliographicCitationDBLPDB;
		    }
		}

		mostSimilarBibliographicCitationDBLP = retrieveById(mostSimilarBibliographicCitationDBLP.get_id());
	    }

	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}

	return mostSimilarBibliographicCitationDBLP;
    }

    /* (non-Javadoc)
     * @see com.cgomez.service.IBibliographicCitationDBLPService#retrieve(java.lang.String, java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public Collection<BibliographicCitationDBLP> retrieve(String field, String value) throws DLBusinessServiceException {
	try {

	    return (Collection<BibliographicCitationDBLP>)(Collection<?>) bibliographicCitationDBLPDAO.find(field, value);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cgomez.service.IPublicationService#group(java.lang.String)
     */
    public List<BibliographicCitationAggregationResult> group(String field) throws DLBusinessServiceException {
	try {

	    return bibliographicCitationDBLPDAO.aggregateByField(field);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
}