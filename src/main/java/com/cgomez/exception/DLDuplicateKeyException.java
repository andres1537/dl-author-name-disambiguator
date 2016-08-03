/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.exception;

/**
 * The Class DLDuplicateKeyException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class DLDuplicateKeyException extends AbstractDLException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4679465159033351431L;

    /**
     * Instantiates a new dBLP duplicate key exception.
     *
     * @param cause
     *            the cause
     */
    public DLDuplicateKeyException(Throwable cause) {
	super(cause);
    }

    /**
     * Instantiates a new dBLP duplicate key exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public DLDuplicateKeyException(String message, Throwable cause) {
	super(message, cause);
    }
}