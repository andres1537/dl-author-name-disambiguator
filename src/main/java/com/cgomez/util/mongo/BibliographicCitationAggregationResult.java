/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.util.mongo;

/**
 * The Class BibliographicCitationAggregationResult.
 */
public class BibliographicCitationAggregationResult {

    /** The _id. */
    private String _id;

    /** The count. */
    private int count;

    /**
     * Gets the _id.
     * 
     * @return the _id
     */
    public String get_id() {
	return _id;
    }

    /**
     * Sets the _id.
     * 
     * @param _id
     *            the new _id
     */
    public void set_id(String _id) {
	this._id = _id;
    }

    /**
     * Gets the count.
     * 
     * @return the count
     */
    public int getCount() {
	return count;
    }

    /**
     * Sets the count.
     * 
     * @param count
     *            the new count
     */
    public void setCount(int count) {
	this.count = count;
    }
}