/*
 * Copyright (c) 2016 cgomez. All rights reserved.
 */
package com.cgomez.model.author;

import com.cgomez.ml.topic.Topic;

/**
 * The Class Discipline.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-java-1.0
 */
public class Discipline {
    
    /** The topic. */
    private Topic topic;
    
    /** The year. */
    private Double year;
    
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
     * Gets the year.
     *
     * @return the year
     */
    public Double getYear() {
        return year;
    }
    
    /**
     * Sets the year.
     *
     * @param year the new year
     */
    public void setYear(Double year) {
        this.year = year;
    }
}