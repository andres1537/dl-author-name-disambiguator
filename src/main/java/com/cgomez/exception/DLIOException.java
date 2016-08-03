/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.exception;

/**
 * The Class DLIOException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class DLIOException extends AbstractDLException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2355972758363880910L;

    /**
     * Instantiates a new DBLPIO exception.
     *
     * @param element the element
     * @param message the message
     * @param cause the cause
     */
    public DLIOException(String element, String message, Throwable cause) {
	super(element, message, cause);
    }
}