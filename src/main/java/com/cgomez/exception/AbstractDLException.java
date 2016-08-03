/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.exception;

import com.cgomez.util.constant.CException;

/**
 * The Class AbstractDLException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public abstract class AbstractDLException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1171509510918162985L;

    /**
     * Instantiates a new abstract dl exception.
     *
     * @param cause the cause
     */
    protected AbstractDLException(Throwable cause) {
	super(cause);
    }

    /**
     * Instantiates a new abstract dl exception.
     *
     * @param message the message
     * @param cause the cause
     */
    protected AbstractDLException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * Instantiates a new abstract dl exception.
     *
     * @param element the element
     * @param message the message
     */
    protected AbstractDLException(String element, String message) {
	super(getFormattedMessage(element, message));
    }

    /**
     * Instantiates a new abstract dl exception.
     *
     * @param element the element
     * @param message the message
     * @param cause the cause
     */
    protected AbstractDLException(String element, String message, Throwable cause) {
	super(getFormattedMessage(element, message), cause);
    }

    /**
     * Gets the formatted message.
     *
     * @param element the element
     * @param message the message
     * @return the formatted message
     */
    private static String getFormattedMessage(String element, String message) {
	StringBuilder messageBuilder = new StringBuilder();
	StringBuilder elementBuilder = new StringBuilder();
	messageBuilder.append(message);

	if (element != null) {
	    elementBuilder.append(CException.WHITE_SPACE);
	    elementBuilder.append(CException.START_ELEMENT_EXCEPTION);
	    elementBuilder.append(element);
	    elementBuilder.append(CException.END_ELEMENT_EXCEPTION);
	}

	return messageBuilder.append(elementBuilder).toString();
    }

    /**
     * Returns the stackTrace of the exception converted in a String.
     *
     * @return the string
     */
    public String toString() {
	StringBuffer stackTrace = new StringBuffer();
	stackTrace.append(CException.NEW_LINE).append(CException.NEW_LINE);
	stackTrace.append(CException.START_EXCEPTION);
	stackTrace.append(this.getMessage());
	stackTrace.append(CException.NEW_LINE).append(CException.NEW_LINE);
	stackTrace.append(CException.CAUSE);
	stackTrace.append(this.getCause());
	stackTrace.append(CException.NEW_LINE).append(CException.NEW_LINE);
	StackTraceElement[] stack = this.getStackTrace();

	stackTrace.append(String.format(CException.FORMAT_EXCEPTION, CException.CLASS_NAME, CException.METHOD_NAME,
		CException.LINE_NUMBER));
	for (StackTraceElement element : stack) {
	    stackTrace.append(String.format(CException.FORMAT_EXCEPTION, element.getClassName(),
		    element.getMethodName(), element.getLineNumber()));
	}

	stackTrace.append(CException.END_EXCEPTION);

	return stackTrace.toString();
    }
}