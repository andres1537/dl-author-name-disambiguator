/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgomez.dao.impl.BibliographicCitationLeeGilesDAOImpl;
import com.cgomez.exception.DLBusinessServiceException;
import com.cgomez.exception.DLDuplicateKeyException;
import com.cgomez.model.bibliography.BibliographicCitationLeeGiles;
import com.cgomez.service.AbstractService;
import com.cgomez.service.IBibliographicCitationLeeGilesService;

/**
 * The Class BibliographicCitationLeeGilesServiceImpl.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
@Service
public class BibliographicCitationLeeGilesServiceImpl extends AbstractService implements IBibliographicCitationLeeGilesService {
    
    /** The bibliographic citation lee giles dao. */
    @Autowired
    private BibliographicCitationLeeGilesDAOImpl bibliographicCitationLeeGilesDAO;

    /* (non-Javadoc)
     * @see com.cgomez.service.IBibliographicCitationLeeGilesService#create(com.cgomez.model.bibliography.BibliographicCitationLeeGiles)
     */
    @Override
    public void create(BibliographicCitationLeeGiles bibliographicCitationLeeGiles) throws DLBusinessServiceException {
	try {

	    bibliographicCitationLeeGilesDAO.insert(bibliographicCitationLeeGiles);

	} catch (DLDuplicateKeyException e) {
	    throw new DLBusinessServiceException("Dupplicate { id: \"" + bibliographicCitationLeeGiles.get_id() + "\" }", e);
	}
    }
}