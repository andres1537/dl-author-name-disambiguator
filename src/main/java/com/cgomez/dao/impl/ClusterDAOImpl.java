/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.dao.impl;

import org.mongojack.DBQuery;
import org.springframework.stereotype.Repository;

import com.cgomez.dao.AbstractDAO;
import com.cgomez.dao.IDAO;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.model.author.Cluster;
import com.cgomez.model.field.ClusterField;
import com.cgomez.util.constant.CErrorException;

/**
 * The Class ClusterDAOImpl.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@Repository
public class ClusterDAOImpl extends AbstractDAO implements IDAO {
    
    /**
     * Find one by name.
     *
     * @param key the key
     * @return the cluster
     * @throws DLDatabaseException the DBLP database exception
     * @throws DLObjectIdException the DBLP object id exception
     */
    public Cluster findByKey(String key) throws DLDatabaseException, DLObjectIdException {
	Cluster cluster = null;

	try {

	    cluster = (Cluster) getCollection().findOne(DBQuery.is(ClusterField.KEY, key));

	} catch (IllegalArgumentException e) {
	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
	}

	return cluster;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see com.cgomez.dao.AbstractDAO#setType()
     */
    @Override
    public void setType() {
	super.type = Cluster.class;
    }
}