/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.dao;

import java.util.Collection;

import org.mongojack.DBQuery;
import org.mongojack.DBQuery.Query;
import org.mongojack.JacksonDBCollection;
import org.mongojack.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;

import com.cgomez.exception.DLDatabaseException;
import com.cgomez.exception.DLDuplicateKeyException;
import com.cgomez.exception.DLObjectIdException;
import com.cgomez.model.AbstractModel;
import com.cgomez.util.constant.CErrorException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoException;

/**
 * The Class AbstractDAO.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public abstract class AbstractDAO {

    /** The type. */
    protected Class<? extends AbstractModel> type;

    /** The mongo db factory. */
    @Autowired
    private MongoDbFactory mongoDBFactory;

    /**
     * Instantiates a new abstract dao.
     */
    public AbstractDAO() {
    	setType();
    }
    
    /**
     * Inserts an object and return saved id.
     *
     * @param entity the entity
     * @throws DLDuplicateKeyException the dBLP duplicate key exception
     */
    public void insert(AbstractModel entity) throws DLDuplicateKeyException {
        try {

            entity.set_id(getCollection().insert(entity).getSavedId());

        } catch (DuplicateKeyException e) {
            throw new DLDuplicateKeyException(CErrorException.ERR_DUPLICATE, e);
        }
    }
    
    /**
     * Update.
     *
     * @param entity the entity
     * @throws DLDatabaseException the DL database exception
     */
    public void update(AbstractModel entity) throws DLDatabaseException {
	try {

	    getCollection().updateById(entity.get_id(), entity);

 	} catch (DuplicateKeyException e) {
 	    throw new DLDatabaseException(CErrorException.ERR_DUPLICATE, e);
 	}
    }
    
    /**
     * Insert or update.
     *
     * @param entity the entity
     * @throws DLDatabaseException the DL database exception
     * @throws DLDuplicateKeyException 
     */
    public void insertOrUpdate(AbstractModel entity) throws DLDatabaseException, DLDuplicateKeyException {
	if (entity.get_id() == null) {
	    insert(entity);
	    
	} else {
	    update(entity);
	}
    }
    
    /**
     * Removes the.
     *
     * @param entityId the entity id
     * @throws DLObjectIdException the DL object id exception
     */
    public void remove(String entityId) throws DLObjectIdException {
	try {
	    
	    getCollection().removeById(entityId);
	
	} catch (IllegalArgumentException e) {
	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
	}
    }
    
    /**
     * Drop collection.
     *
     * @throws DLDatabaseException the DL database exception
     */
    public void drop() throws DLDatabaseException {
	try {
	    
	    getCollection().drop();
	    
	} catch (MongoException e) {
	    throw new DLDatabaseException(CErrorException.ERR_NOT_EXISTING_COLLECTION, e);
	}
    }
    
    /**
     * Find one by id.
     *
     * @param entityId the entity id
     * @return the abstract model
     * @throws DLObjectIdException the DBLP object id exception
     */
    public AbstractModel findOneById(String entityId) throws DLObjectIdException {
	try {

	    return getCollection().findOneById(entityId);

	} catch (IllegalArgumentException e) {
	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
	}
    }
    
    /**
     * Find.
     *
     * @param field the field
     * @param value the value
     * @return the abstract model
     * @throws DLObjectIdException the DL object id exception
     */
    public Collection<AbstractModel> find(String field, String value) throws DLObjectIdException {
  	try {

  	    Query query = DBQuery.is(field, value);
  	    return getCollection().find(query).toArray();

  	} catch (IllegalArgumentException e) {
  	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
  	}
    }
    
    /**
     * Find all.
     *
     * @return the collection
     * @throws DLObjectIdException the DL object id exception
     */
    public Collection<AbstractModel> findAll() throws DLObjectIdException {
	try {

	    return getCollection().find().toArray();

	} catch (IllegalArgumentException e) {
  	    throw new DLObjectIdException(CErrorException.ERR_NOT_EXISTING_ENTITY, e);
	}
    }
    
    /**
     * Count.
     *
     * @return the long
     * @throws DLDatabaseException the DL database exception
     */
    public long count() throws DLDatabaseException {
	try {

	    return getCollection().count();

	} catch (MongoException e) {
	    throw new DLDatabaseException(CErrorException.ERR_NOT_EXISTING_COLLECTION, e);
	}
    }
    
    /**
     * Creates the index.
     *
     * @param field the field
     * @param isAscending the is ascending
     * @param isUnique the is unique
     * @throws DLDatabaseException the DL database exception
     */
    public void createIndex(String field, boolean isAscending, boolean isUnique) throws DLDatabaseException {
	try {

	    DBObject keys = new BasicDBObject(field, isAscending ? 1 : -1);
	    DBObject options = new BasicDBObject("unique", isUnique);
	    getCollection().createIndex(keys, options);
	    
	} catch (MongoException e) {
	    throw new DLDatabaseException(CErrorException.ERR_NOT_EXISTING_COLLECTION, e);
	}
    }
    
    /**
     * Sets the type.
     */
    public abstract void setType();

    /**
     * Gets the collection.
     * 
     * @return the collection
     */
    @SuppressWarnings("unchecked")
    public JacksonDBCollection<AbstractModel, String> getCollection() {
        return (JacksonDBCollection<AbstractModel, String>) JacksonDBCollection.wrap(
                mongoDBFactory.getDb().getCollection(type.getAnnotation(MongoCollection.class).name()), type, String.class);
    }
}