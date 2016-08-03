/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.service;

import java.util.Collection;

import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.model.bibliography.BibliographicCitationSynchronized;

/**
 * The Interface IBibliographicCitationSynchronizedService.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
public interface IBibliographicCitationSynchronizedService {
    
    /**
     * Creates the.
     *
     * @param bibliographicCitationSynchronized the bibliographic citation synchronized
     * @throws DLBusinessServiceException the DL business service exception
     */
    void create(BibliographicCitationSynchronized bibliographicCitationSynchronized) throws DLBusinessServiceException;
    
    /**
     * List by cluster.
     *
     * @param key the key
     * @return the collection
     * @throws DLBusinessServiceException the DL business service exception
     */
    Collection<BibliographicCitationSynchronized> listByCluster(String key) throws DLBusinessServiceException;
}