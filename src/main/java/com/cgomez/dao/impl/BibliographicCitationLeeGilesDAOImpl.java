/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.dao.impl;

import org.springframework.stereotype.Repository;

import com.cgomez.dao.AbstractDAO;
import com.cgomez.dao.IDAO;
import com.cgomez.model.bibliography.BibliographicCitationLeeGiles;

/**
 * The Class BibliographicCitationLeeGilesDAOImpl.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
@Repository
public class BibliographicCitationLeeGilesDAOImpl extends AbstractDAO implements IDAO {
    
    /* (non-Javadoc)
     * @see com.cgomez.dao.AbstractDAO#setType()
     */
    @Override
    public void setType() {
	super.type = BibliographicCitationLeeGiles.class;
    }
}