/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgomez.dao.impl.ClusterDAOImpl;
import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLDuplicateKeyException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.model.author.Cluster;
import com.cgomez.service.AbstractService;
import com.cgomez.service.IClusterService;

/**
 * The Class ClusterServiceImpl.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since AuthorDisambiguatorApp-1.0
 */
@Service
public class ClusterServiceImpl extends AbstractService implements IClusterService {

    /** The cluster dao. */
    @Autowired
    private ClusterDAOImpl clusterDAO;

    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#create(com.cgomez.model.bibliography.Cluster)
     */
    @Override
    public void create(Cluster cluster) throws DLBusinessServiceException {
	try {

	    clusterDAO.insert(cluster);

	} catch (DLDuplicateKeyException e) {
	    throw new DLBusinessServiceException("Dupplicate { key: \"" + cluster.getKey() + "\" }", e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#remove(java.lang.String)
     */
    @Override
    public void remove(String id) throws DLBusinessServiceException {
	try {

	    clusterDAO.remove(id);
	    
	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#retrieveByKey(java.lang.String)
     */
    @Override
    public Cluster retrieveByKey(String key) throws DLBusinessServiceException {
	try {

	    return clusterDAO.findByKey(key);

	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#change(com.cgomez.model.author.Cluster)
     */
    @Override
    public void change(Cluster cluster) throws DLBusinessServiceException {
	try {

	    clusterDAO.update(cluster);

	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#removeCollection()
     */
    @Override
    public void removeCollection() throws DLBusinessServiceException {
	try {
	    
	    clusterDAO.drop();
	    
	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}	
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#listAll()
     */
    @SuppressWarnings("unchecked")
    @Override
    public Collection<Cluster> listAll() throws DLBusinessServiceException {
	try {

	    return (Collection<Cluster>) (Collection<?>) clusterDAO.findAll();

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#count()
     */
    @Override
    public long count() throws DLBusinessServiceException {
	try {

	    return clusterDAO.count();

	} catch (DLDatabaseException e) {
  	    throw new DLBusinessServiceException(e);
	}
    }

    /* (non-Javadoc)
     * @see com.cgomez.service.IClusterService#createIndex(java.lang.String, boolean, boolean)
     */
    @Override
    public void createIndex(String field, boolean isAscending, boolean isUnique) throws DLBusinessServiceException {
	try {
	    
	    clusterDAO.createIndex(field, isAscending, isUnique);
	    
	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
}