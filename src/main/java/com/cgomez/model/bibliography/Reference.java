/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.model.bibliography;

import java.util.Collection;

import javax.persistence.Transient;

import org.mongojack.MongoCollection;

import com.cgomez.ml.topic.Topic;
import com.cgomez.model.AbstractModel;

/**
 * The Class Reference.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
@MongoCollection(name = "references")
public class Reference extends AbstractModel implements Comparable<Reference> {

    /** The bibliographic citation id. */
    private String bibliographicCitationId;
    
    /** The author. */
    private String author;

    /** The coauthors. */
    private Collection<String> coauthors;

    /** The title. */
    private String title;

    /** The publication venue. */
    private String publicationVenue;
    
    /** The year. */
    private Integer year;
    
    // extras
    /** The topic. */
    private Topic topic;
    
    /** The score. */
    @Transient
    private Double score;
    
    /** The re disambiguation. */
    @Transient
    private Integer reDisambiguation;
    
    /**
     * Gets the bibliographic citation id.
     *
     * @return the bibliographic citation id
     */
    public String getBibliographicCitationId() {
        return bibliographicCitationId;
    }

    /**
     * Sets the bibliographic citation id.
     *
     * @param bibliographicCitationId the new bibliographic citation id
     */
    public void setBibliographicCitationId(String bibliographicCitationId) {
        this.bibliographicCitationId = bibliographicCitationId;
    }

    /**
     * Gets the author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     *
     * @param author the new author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the coauthors.
     *
     * @return the coauthors
     */
    public Collection<String> getCoauthors() {
        return coauthors;
    }

    /**
     * Sets the coauthors.
     *
     * @param coauthors the new coauthors
     */
    public void setCoauthors(Collection<String> coauthors) {
        this.coauthors = coauthors;
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
     * Gets the publication venue.
     *
     * @return the publication venue
     */
    public String getPublicationVenue() {
        return publicationVenue;
    }

    /**
     * Sets the publication venue.
     *
     * @param publicationVenue the new publication venue
     */
    public void setPublicationVenue(String publicationVenue) {
        this.publicationVenue = publicationVenue;
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

    /**
     * Gets the score.
     *
     * @return the score
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the score.
     *
     * @param score the new score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * Gets the re disambiguation.
     *
     * @return the re disambiguation
     */
    public Integer getReDisambiguation() {
        return reDisambiguation;
    }

    /**
     * Sets the re disambiguation.
     *
     * @param reDisambiguation the new re disambiguation
     */
    public void setReDisambiguation(Integer reDisambiguation) {
        this.reDisambiguation = reDisambiguation;
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Reference o) {
	// Descending sorting
	return Double.compare(o.getScore() == null ? 0d : o.getScore(), this.score == null ? 0d : this.score);
    }
}