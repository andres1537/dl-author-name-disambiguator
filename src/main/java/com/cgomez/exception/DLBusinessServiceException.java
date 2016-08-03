/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.exception;

/**
 * The Class DLBusinessServiceException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class DLBusinessServiceException extends AbstractDLException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7063357875622010660L;

    /**
     * Instantiates a new DBLP business service exception.
     *
     * @param cause the cause
     */
    public DLBusinessServiceException(Throwable cause) {
	super(cause);
    }

    /**
     * Instantiates a new DBLP business service exception.
     *
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public DLBusinessServiceException(String message, Throwable cause) {
	super(message, cause);
    }
}