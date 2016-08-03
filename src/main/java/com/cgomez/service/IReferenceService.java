/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.service;

import java.util.Collection;

import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.model.bibliography.Reference;

/**
 * The Interface IReferenceService.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public interface IReferenceService {

    /**
     * Creates the or update.
     *
     * @param reference the reference
     * @throws DLBusinessServiceException the DL business service exception
     */
    void createOrUpdate(Reference reference) throws DLBusinessServiceException;
    
    /**
     * Retrieve by id.
     *
     * @param id the id
     * @return the reference
     * @throws DBLPBusinessServiceExcepton the DBLP business service excepton
     */
    Reference retrieveById(String id) throws DLBusinessServiceException;
    
    /**
     * Retrieve.
     *
     * @param field the field
     * @param value the value
     * @return the collection
     * @throws DLBusinessServiceException the DL business service exception
     */
    Collection<Reference> retrieve(String field, String value) throws DLBusinessServiceException;
    
    /**
     * Change.
     *
     * @param reference the reference
     * @throws DLBusinessServiceException the DL business service exception
     */
    void change(Reference reference) throws DLBusinessServiceException;
    
    /**
     * Change predicted class.
     *
     * @param fromPredictedClass the from predicted class
     * @param toPredictedClass the to predicted class
     * @throws DLBusinessServiceException the DL business service exception
     */
    void changePredictedClass(String fromPredictedClass, String toPredictedClass) throws DLBusinessServiceException;
    
    /**
     * Removes the collection.
     *
     * @throws DLBusinessServiceException the DL business service exception
     */
    void removeCollection() throws DLBusinessServiceException;
    
    /**
     * List all.
     * 
     * @return the collection
     * @throws DLBusinessServiceException
     *             the DBLP business service exception
     */
    Collection<Reference> listAll() throws DLBusinessServiceException;
    
    /**
     * Count.
     *
     * @return the long
     * @throws DLBusinessServiceException the DL business service exception
     */
    long count() throws DLBusinessServiceException;
    
    /**
     * Creates the index.
     *
     * @param field the field
     * @param isAscending the is ascending
     * @param isUnique the is unique
     * @throws DLBusinessServiceException the DL business service exception
     */
    void createIndex(String field, boolean isAscending, boolean isUnique) throws DLBusinessServiceException;
}