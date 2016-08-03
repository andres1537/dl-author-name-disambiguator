/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.exception;

/**
 * The Class DLNoContentException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class DLNoContentException extends AbstractDLException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4967690414836014381L;

    /**
     * Instantiates a new dBLP no content exception.
     *
     * @param message
     *            the message
     */
    public DLNoContentException(String message) {
	super(null, message);
    }
}