/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.model.author;

import java.util.List;

import org.mongojack.MongoCollection;

import com.cgomez.model.AbstractModel;

/**
 * The Class Cluster.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@MongoCollection(name = "clusters")
public class Cluster extends AbstractModel {
    
    /** The key. */
    private String key;
    
    /** The medoid. */
    private Medoid medoid;
    
    /** The disciplines. */
    private List<Discipline> disciplines;
    
    /**
     * Gets the key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key the new key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets the medoid.
     *
     * @return the medoid
     */
    public Medoid getMedoid() {
        return medoid;
    }

    /**
     * Sets the medoid.
     *
     * @param medoid the new medoid
     */
    public void setMedoid(Medoid medoid) {
        this.medoid = medoid;
    }

    /**
     * Gets the disciplines.
     *
     * @return the disciplines
     */
    public List<Discipline> getDisciplines() {
        return disciplines;
    }
    
    /**
     * Sets the disciplines.
     *
     * @param disciplines the new disciplines
     */
    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Cluster other = (Cluster) obj;
	if (key == null) {
	    if (other.key != null)
		return false;
	} else if (!key.equals(other.key))
	    return false;
	return true;
    }
}