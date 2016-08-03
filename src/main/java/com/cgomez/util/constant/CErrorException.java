/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.util.constant;

/**
 * The Class CErrorException.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class CErrorException {

    /**
     * Instantiates a new c error exception.
     */
    private CErrorException() {
    }

    /** The Constant ERR_NOT_EXISTING_ENTITY. */
    public static final String ERR_NOT_EXISTING_ENTITY = "Entity doesn't exist into the DB.";
    
    /** The Constant ERR_NOT_EXISTING_COLLECTION. */
    public static final String ERR_NOT_EXISTING_COLLECTION = "Collection doesn't exist into the DB.";

    /** The Constant ERR_NOT_FILE_LOADED. */
    public static final String ERR_NOT_FILE_LOADED = "Can't be loaded the file.";

    /** The Constant ERR_DUPLICATE. */
    public static final String ERR_DUPLICATE = "Duplicated record.";
}