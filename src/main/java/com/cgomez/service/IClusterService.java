/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.service;

import java.util.Collection;

import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.model.author.Cluster;

/**
 * The Interface IClusterService.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public interface IClusterService {

    /**
     * Creates the.
     * 
     * @param cluster the cluster
     * @throws DLBusinessServiceException the DBLP business service exception
     */
    void create(Cluster cluster) throws DLBusinessServiceException;
    
    /**
     * Removes the cluster.
     *
     * @param id the id
     * @throws DLBusinessServiceException the DL business service exception
     */
    void remove(String id) throws DLBusinessServiceException;
    
    /**
     * Retrieve by name.
     *
     * @param key the key
     * @return the cluster
     * @throws DLBusinessServiceException the DBLP business service exception
     */
    Cluster retrieveByKey(String key) throws DLBusinessServiceException;
    
    /**
     * Change.
     *
     * @param cluster the cluster
     * @throws DLBusinessServiceException the DL business service exception
     */
    void change(Cluster cluster) throws DLBusinessServiceException;
    
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
     * @throws DLBusinessServiceException the DBLP business service exception
     */
    Collection<Cluster> listAll() throws DLBusinessServiceException;
    
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