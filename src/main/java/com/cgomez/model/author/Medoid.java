/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.model.author;

import java.util.List;

/**
 * The Class Medoid.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
public class Medoid {
    
    /** The id. */
    private String id;
    
    /** The neighbors. */
    private List<Neighbor> neighbors;
    
    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Gets the neighbors.
     *
     * @return the neighbors
     */
    public List<Neighbor> getNeighbors() {
        return neighbors;
    }
    
    /**
     * Sets the neighbors.
     *
     * @param neighbors the new neighbors
     */
    public void setNeighbors(List<Neighbor> neighbors) {
        this.neighbors = neighbors;
    }
}