/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.util.helper;

import com.cgomez.model.bibliography.BibliographicCitationDBLP;
import com.cgomez.model.bibliography.BibliographicCitationSynchronized;

/**
 * The Class BeansHelper.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
public final class BeansHelper {

    /**
     * Instantiates a new beans helper.
     */
    private BeansHelper() {
    }

    /**
     * Map.
     *
     * @param bibliographicCitationDBLP the bibliographic citation dblp
     * @return the bibliographic citation synchronized
     */
    public static BibliographicCitationSynchronized map(BibliographicCitationDBLP bibliographicCitationDBLP) {
	BibliographicCitationSynchronized bibliographicCitationSynchronized = new BibliographicCitationSynchronized();
	bibliographicCitationSynchronized.setAuthors(bibliographicCitationDBLP.getAuthors());
	bibliographicCitationSynchronized.setTitle(bibliographicCitationDBLP.getTitle());
	bibliographicCitationSynchronized.setYear(bibliographicCitationDBLP.getYear());
	bibliographicCitationSynchronized.setJournal(bibliographicCitationDBLP.getJournal());
	bibliographicCitationSynchronized.setBooktitle(bibliographicCitationDBLP.getBooktitle());
	bibliographicCitationSynchronized.setType(bibliographicCitationDBLP.getType());
	
	return bibliographicCitationSynchronized;
    }
}