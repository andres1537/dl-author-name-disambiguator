/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.util.constant;

/**
 * BibliographicCitationEnum.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public enum BibliographicCitationEnum {

    /** The article. */
    ARTICLE("article"), /** The inproceedings. */
    INPROCEEDINGS("inproceedings"), /** The proceedings. */
    PROCEEDINGS("proceedings"), /** The book. */
    BOOK("book"), /** The incollection. */
    INCOLLECTION("incollection"), /** The phdthesis. */
    PHDTHESIS("phdthesis"), /** The mastersthesis. */
    MASTERSTHESIS("mastersthesis"), /** The www. */
    WWW("www"), /** The other. */
    NONE("none");

    /** The value. */
    private String value;

    /**
     * Instantiates a new bibliographic citation enum.
     * 
     * @param value
     *            the value
     */
    BibliographicCitationEnum(String value) {
	this.value = value;
    }

    /**
     * Value.
     * 
     * @return the string
     */
    public String value() {
	return value;
    }

    /**
     * Gets the enum.
     * 
     * @param value
     *            the value
     * @return the enum
     */
    public static BibliographicCitationEnum getEnum(String value) {
	for (BibliographicCitationEnum element : values()) {
	    if (element.value.equalsIgnoreCase(value)) {
		return element;
	    }
	}

	return NONE;
    }
}