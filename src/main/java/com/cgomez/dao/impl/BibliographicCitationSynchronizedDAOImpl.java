/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.dao.impl;

import java.util.Collection;

import org.mongojack.DBQuery;
import org.mongojack.DBQuery.Query;
import org.springframework.stereotype.Repository;

import com.cgomez.dao.AbstractDAO;
import com.cgomez.dao.IDAO;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.model.bibliography.BibliographicCitationSynchronized;
import com.cgomez.model.field.BibliographicCitationSynchronizedField;
import com.cgomez.util.constant.CErrorException;

/**
 * The Class BibliographicCitationSynchronizedDAOImpl.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
@Repository
public class BibliographicCitationSynchronizedDAOImpl extends AbstractDAO implements IDAO {
    
    /**
     * Find by cluster.
     *
     * @param key the key
     * @return the collection
     * @throws DLDatabaseException the DL database exception
     * @throws DLObjectIdException the DL object id exception
     */
    @SuppressWarnings("unchecked")
    public Collection<BibliographicCitationSynchronized> findByCluster(String key) throws DLDatabaseException, DLObjectIdException {
	Collection<BibliographicCitationSynchronized> bibliographicCitationsSynchronized = null;

	try {

	    Query query = DBQuery.is(BibliographicCitationSynchronizedField.ACTUAL_CLASS, key);
	    bibliographicCitationsSynchronized = (Collection<BibliographicCitationSynchronized>) (Collection<?>) getCollection().find(query).toArray();

	} catch (IllegalArgumentException e) {
	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
	}

	return bibliographicCitationsSynchronized;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cgomez.dao.AbstractDAO#setType()
     */
    @Override
    public void setType() {
	super.type = BibliographicCitationSynchronized.class;
    }
}