/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.exception;

/**
 * The Class DLDatabaseException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class DLDatabaseException extends AbstractDLException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -474715687663779056L;

    /**
     * Instantiates a new dBLP database exception.
     *
     * @param cause
     *            the cause
     */
    public DLDatabaseException(Throwable cause) {
	super(cause);
    }

    /**
     * Instantiates a new dBLP database exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public DLDatabaseException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * Instantiates a new dBLP database exception.
     *
     * @param element
     *            the element
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public DLDatabaseException(String element, String message, Throwable cause) {
	super(element, message, cause);
    }
}