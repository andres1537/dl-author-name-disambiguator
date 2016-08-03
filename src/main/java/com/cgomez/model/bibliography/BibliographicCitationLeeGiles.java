/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.model.bibliography;

import java.util.List;

import org.mongojack.MongoCollection;

import com.cgomez.model.AbstractModel;

/**
 * The Class BibliographicCitationLeeGiles.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
@MongoCollection(name = "bibliographicCitationsLeeGiles")
public class BibliographicCitationLeeGiles extends AbstractModel {
    
    /** The authors. */
    private List<String> authors;
    
    /** The title. */
    private String title;
    
    /** The journal. */
    private String journal;
    
    /** The group id. */
    private String groupId;
    
    /**
     * Gets the authors.
     *
     * @return the authors
     */
    public List<String> getAuthors() {
        return authors;
    }
    
    /**
     * Sets the authors.
     *
     * @param authors the new authors
     */
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    
    /**
     * Gets the title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the title.
     *
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Gets the journal.
     *
     * @return the journal
     */
    public String getJournal() {
        return journal;
    }
    
    /**
     * Sets the journal.
     *
     * @param journal the new journal
     */
    public void setJournal(String journal) {
        this.journal = journal;
    }
    
    /**
     * Gets the group id.
     *
     * @return the group id
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * Sets the group id.
     *
     * @param groupId the new group id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}