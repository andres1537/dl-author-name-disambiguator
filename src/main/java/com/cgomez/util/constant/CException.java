/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.util.constant;

/**
 * The Class CException.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class CException {

    /**
     * Instantiates a new c exception.
     */
    private CException() {
    }

    /** The Constant FORMAT_EXCEPTION. */
    public static final String FORMAT_EXCEPTION = "|%1$-80s|%2$-30s|%3$-3s|\r\n";

    /** The Constant START_ELEMENT_EXCEPTION. */
    public static final String START_ELEMENT_EXCEPTION = "<<";

    /** The Constant END_ELEMENT_EXCEPTION. */
    public static final String END_ELEMENT_EXCEPTION = ">>";

    /** The Constant START_EXCEPTION. */
    public static final String START_EXCEPTION = "EXCEPTION: ";

    /** The Constant CAUSE. */
    public static final String CAUSE = "CAUSE: ";

    /** The Constant END_EXCEPTION. */
    public static final String END_EXCEPTION = "********** END EXCEPTION **********";

    /** The Constant CLASS_NAME. */
    public static final String CLASS_NAME = "CLASS";

    /** The Constant METHOD_NAME. */
    public static final String METHOD_NAME = "METHOD";

    /** The Constant LINE_NUMBER. */
    public static final String LINE_NUMBER = "LINE";

    /** The Constant WHITE_SPACE. */
    public static final String WHITE_SPACE = " ";

    /** The Constant COLON. */
    public static final String COLON = ":";

    /** The Constant NEW_LINE. */
    public static final String NEW_LINE = "\r\n";
}