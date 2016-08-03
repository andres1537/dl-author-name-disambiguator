/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.xml.bibliographic;

import javax.xml.bind.annotation.XmlRootElement;

import com.cgomez.xml.AbstractBibliographicCitation;

/**
 * Book.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@XmlRootElement(name = "book")
public class Book extends AbstractBibliographicCitation {
}