/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.service;

import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.model.bibliography.BibliographicCitationLeeGiles;

/**
 * The Interface IBibliographicCitationLeeGilesService.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
public interface IBibliographicCitationLeeGilesService {
    
    /**
     * Creates the.
     *
     * @param bibliographicCitationLeeGiles the bibliographic citation lee giles
     * @throws DLBusinessServiceException the DL business service exception
     */
    void create(BibliographicCitationLeeGiles bibliographicCitationLeeGiles) throws DLBusinessServiceException;
}