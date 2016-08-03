/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgomez.dao.impl.ReferenceDAOImpl;
import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLDuplicateKeyException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.model.bibliography.Reference;
import com.cgomez.service.AbstractService;
import com.cgomez.service.IReferenceService;

/**
 * The Class ReferenceServiceImpl.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@Service
public class ReferenceServiceImpl extends AbstractService implements IReferenceService {

    /** The reference dao. */
    @Autowired
    private ReferenceDAOImpl referenceDAO;

    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#createOrUpdate(com.cgomez.model.bibliography.Reference)
     */
    @Override
    public void createOrUpdate(Reference reference) throws DLBusinessServiceException {
	try {

	    referenceDAO.insertOrUpdate(reference);

	} catch (DLDuplicateKeyException e) {
	    throw new DLBusinessServiceException("Dupplicate { id: \"" + reference.get_id() + "\" }", e);
	    
	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}

    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#retrieveById(java.lang.String)
     */
    @Override
    public Reference retrieveById(String id) throws DLBusinessServiceException {
	try {

	    return (Reference) referenceDAO.findOneById(id);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#retrieve(java.lang.String, java.lang.String)
     */
    @Override
    @SuppressWarnings("unchecked")
    public Collection<Reference> retrieve(String field, String value) throws DLBusinessServiceException {
	try {

	    return (Collection<Reference>)(Collection<?>) referenceDAO.find(field, value);

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#change(com.cgomez.model.bibliography.Reference)
     */
    @Override
    public void change(Reference reference) throws DLBusinessServiceException {
	try {

	    referenceDAO.update(reference);

	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#changePredictedClass(java.lang.String, java.lang.String)
     */
    @Override
    public void changePredictedClass(String fromPredictedClass, String toPredictedClass) throws DLBusinessServiceException {
	try {

	    referenceDAO.updatePredictedClass(fromPredictedClass, toPredictedClass);

	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#removeCollection()
     */
    @Override
    public void removeCollection() throws DLBusinessServiceException {
	try {
	    
	    referenceDAO.drop();
	    
	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}	
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.cgomez.service.IReferenceService#listAll()
     */
    @SuppressWarnings("unchecked")
    @Override
    public Collection<Reference> listAll() throws DLBusinessServiceException {
	try {

	    return (Collection<Reference>) (Collection<?>) referenceDAO.findAll();

	} catch (DLObjectIdException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
    
    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#count()
     */
    @Override
    public long count() throws DLBusinessServiceException {
	try {

	    return referenceDAO.count();

	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}
    }

    /* (non-Javadoc)
     * @see com.cgomez.service.IReferenceService#createIndex(java.lang.String, boolean, boolean)
     */
    @Override
    public void createIndex(String field, boolean isAscending, boolean isUnique) throws DLBusinessServiceException {
	try {
	    
	    referenceDAO.createIndex(field, isAscending, isUnique);
	    
	} catch (DLDatabaseException e) {
	    throw new DLBusinessServiceException(e);
	}
    }
}