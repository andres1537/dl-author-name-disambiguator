/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.service;

import java.util.Collection;
import java.util.List;

import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.model.bibliography.BibliographicCitationDBLP;
import com.cgomez.util.mongo.BibliographicCitationAggregationResult;

/**
 * The Interface IBibliographicCitationDBLPService.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public interface IBibliographicCitationDBLPService {
    
    /**
     * Creates the.
     *
     * @param bibliographicCitationDBLP the bibliographic citation dblp
     * @throws DLBusinessServiceException the DL business service exception
     */
    void create(BibliographicCitationDBLP bibliographicCitationDBLP) throws DLBusinessServiceException;
    
    /**
     * Retrieve by id.
     *
     * @param id the id
     * @return the bibliographic citation dblp
     * @throws DLBusinessServiceException the DL business service exception
     */
    BibliographicCitationDBLP retrieveById(String id) throws DLBusinessServiceException;
    
    /**
     * Retrieve most similar.
     *
     * @param title the title
     * @return the bibliographic citation dblp
     * @throws DLBusinessServiceException the DL business service exception
     */
    BibliographicCitationDBLP retrieveMostSimilar(String title) throws DLBusinessServiceException;
    
    /**
     * Retrieve.
     *
     * @param field the field
     * @param value the value
     * @return the collection
     * @throws DLBusinessServiceException the DL business service exception
     */
    Collection<BibliographicCitationDBLP> retrieve(String field, String value) throws DLBusinessServiceException;
    
    /**
     * Group.
     *
     * @param field the field
     * @return the list
     * @throws DLBusinessServiceException the DL business service exception
     */
    List<BibliographicCitationAggregationResult> group(String field) throws DLBusinessServiceException;
}