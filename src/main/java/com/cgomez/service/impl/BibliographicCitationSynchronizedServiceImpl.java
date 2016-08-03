/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgomez.dao.impl.BibliographicCitationSynchronizedDAOImpl;
import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLDuplicateKeyException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.model.bibliography.BibliographicCitationSynchronized;
import com.cgomez.service.AbstractService;
import com.cgomez.service.IBibliographicCitationSynchronizedService;

/**
 * The Class BibliographicCitationSynchronizedServiceImpl.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
@Service
public class BibliographicCitationSynchronizedServiceImpl extends AbstractService implements IBibliographicCitationSynchronizedService {
    
    /** The bibliographic citation synchronized dao. */
    @Autowired
    private BibliographicCitationSynchronizedDAOImpl bibliographicCitationSynchronizedDAO;

    /* (non-Javadoc)
     * @see com.cgomez.service.IBibliographicCitationSynchronizedService#create(com.cgomez.model.bibliography.BibliographicCitationSynchronized)
     */
    @Override
    public void create(BibliographicCitationSynchronized bibliographicCitationSynchronized) throws DLBusinessServiceException {
	try {

	    bibliographicCitationSynchronizedDAO.insert(bibliographicCitationSynchronized);

	} catch (DLDuplicateKeyException e) {
	    throw new DLBusinessServiceException("Dupplicate { id: \"" + bibliographicCitationSynchronized.get_id() + "\" }", e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IBibliographicCitationSynchronizedService#listByCluster(java.lang.String)
     */
    @Override
    public Collection<BibliographicCitationSynchronized> listByCluster(String key) throws DLBusinessServiceException {
	try {

	    return bibliographicCitationSynchronizedDAO.findByCluster(key);

	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
}