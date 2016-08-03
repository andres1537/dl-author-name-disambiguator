/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.dao.impl;

import org.mongojack.DBQuery;
import org.mongojack.DBQuery.Query;
import org.mongojack.DBUpdate;
import org.springframework.stereotype.Repository;

import com.cgomez.dao.AbstractDAO;
import com.cgomez.dao.IDAO;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.model.bibliography.Reference;
import com.cgomez.model.field.ReferenceField;
import com.cgomez.util.constant.CErrorException;
import com.mongodb.DuplicateKeyException;

/**
 * The Class ReferenceDAOImpl.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@Repository
public class ReferenceDAOImpl extends AbstractDAO implements IDAO {
    
    /**
     * Update predicted class.
     *
     * @param fromPredictedClass the from predicted class
     * @param toPredictedClass the to predicted class
     * @throws DLDatabaseException the DL database exception
     */
    public void updatePredictedClass(String fromPredictedClass, String toPredictedClass) throws DLDatabaseException {
	try {

	    Query query = DBQuery.is(ReferenceField.PREDICTED_CLASS, fromPredictedClass);
 	    getCollection().updateMulti(query, DBUpdate.set(ReferenceField.PREDICTED_CLASS, toPredictedClass));
 	    
 	} catch (DuplicateKeyException e) {
 	    throw new DLDatabaseException(CErrorException.ERR_DUPLICATE, e);
 	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cgomez.dao.AbstractDAO#setType()
     */
    /**
     * {@inheritDoc}
     * 
     * @see com.cgomez.dao.AbstractDAO#setType()
     */
    @Override
    public void setType() {
	super.type = Reference.class;
    }
}