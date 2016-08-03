/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.model;

import org.mongojack.ObjectId;

import com.cgomez.util.Instance;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class AbstractModel.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractModel extends Instance {

    /**
     * Gets the _id.
     *
     * @return the _id
     */
    @ObjectId
    public String get_id() {
	return super._id;
    }
}