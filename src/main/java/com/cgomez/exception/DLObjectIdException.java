/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.exception;

/**
 * The Class DLObjectIdException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class DLObjectIdException extends AbstractDLException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1671295234908242546L;

    /**
     * Instantiates a new dBLP object id exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public DLObjectIdException(String message, Throwable cause) {
	super(message, cause);
    }
}