/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.model.bibliography;

import java.util.List;

import org.mongojack.MongoCollection;

import com.cgomez.ml.topic.Topic;
import com.cgomez.model.AbstractModel;
import com.cgomez.util.constant.BibliographicCitationEnum;

/**
 * The Class BibliographicCitationSynchronized.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
@MongoCollection(name = "bibliographicCitationsSynchronized")
public class BibliographicCitationSynchronized extends AbstractModel {
    
    /** The authors. */
    private List<String> authors;
    
    /** The title. */
    private String title;
    
    /** The year. */
    private Integer year;
    
    /** The journal. */
    private String journal;
    
    /** The booktitle. */
    private String booktitle;
    
    /** The type. */
    private BibliographicCitationEnum type;
    
    /** The title lee giles. */
    // extras
    /** The topic. */
    private Topic topic;

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
     * Gets the year.
     *
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the year.
     *
     * @param year the new year
     */
    public void setYear(Integer year) {
        this.year = year;
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
     * Gets the booktitle.
     *
     * @return the booktitle
     */
    public String getBooktitle() {
        return booktitle;
    }

    /**
     * Sets the booktitle.
     *
     * @param booktitle the new booktitle
     */
    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public BibliographicCitationEnum getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(BibliographicCitationEnum type) {
        this.type = type;
    }

    /**
     * Gets the topic.
     *
     * @return the topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     * Sets the topic.
     *
     * @param topic the new topic
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}