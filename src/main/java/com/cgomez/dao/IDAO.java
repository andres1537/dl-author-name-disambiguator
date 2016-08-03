/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.dao;

import org.mongojack.JacksonDBCollection;

/**
 * The Interface IDAO.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public interface IDAO {
	
	/**
	 * Gets the collection.
	 *
	 * @return the collection
	 */
	JacksonDBCollection<?, String> getCollection();
}