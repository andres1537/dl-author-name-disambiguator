/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.model.author;

/**
 * The Class Neighbor.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
public class Neighbor implements Comparable<Neighbor> {
    
    /** The id. */
    private String id;
    
    /** The score. */
    private Double score;
    
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
     * Gets the score.
     *
     * @return the score
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the score.
     *
     * @param score the new score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Neighbor o) {
	// Descending sorting
	return Double.compare(o.getScore() == null ? 0d : o.getScore(), this.score == null ? 0d : this.score);
    }
}