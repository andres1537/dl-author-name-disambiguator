/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.model.bibliography;

import java.util.List;

import org.mongojack.MongoCollection;

import com.cgomez.model.AbstractModel;
import com.cgomez.util.constant.BibliographicCitationEnum;

/**
 * The Class BibliographicCitationDBLP.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@MongoCollection(name = "bibliographicCitationsDBLP")
public class BibliographicCitationDBLP extends AbstractModel {
    
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
    
    // dblp attributes
    /** The key. */
    private String key;

    /** The mdate. */
    private String mdate;

    /** The publtype. */
    private String publtype;

    /** The reviewid. */
    private String reviewid;

    /** The rating. */
    private String rating;
    
    /** The editor. */
    private String editor;

    /** The pages. */
    private String pages;

    /** The address. */
    private String address;

    /** The volume. */
    private String volume;

    /** The number. */
    private String number;

    /** The month. */
    private String month;

    /** The url. */
    private String url;

    /** The ee. */
    private String ee;

    /** The cdrom. */
    private String cdrom;

    /** The citations. */
    private List<String> citations;

    /** The publisher. */
    private String publisher;

    /** The note. */
    private String note;

    /** The crossref. */
    private String crossref;

    /** The isbn. */
    private String isbn;

    /** The series. */
    private String series;

    /** The school. */
    private String school;

    /** The chapter. */
    private String chapter;
    
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
     * Gets the key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key the new key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets the mdate.
     *
     * @return the mdate
     */
    public String getMdate() {
        return mdate;
    }

    /**
     * Sets the mdate.
     *
     * @param mdate the new mdate
     */
    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    /**
     * Gets the publtype.
     *
     * @return the publtype
     */
    public String getPubltype() {
        return publtype;
    }

    /**
     * Sets the publtype.
     *
     * @param publtype the new publtype
     */
    public void setPubltype(String publtype) {
        this.publtype = publtype;
    }

    /**
     * Gets the reviewid.
     *
     * @return the reviewid
     */
    public String getReviewid() {
        return reviewid;
    }

    /**
     * Sets the reviewid.
     *
     * @param reviewid the new reviewid
     */
    public void setReviewid(String reviewid) {
        this.reviewid = reviewid;
    }

    /**
     * Gets the rating.
     *
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the rating.
     *
     * @param rating the new rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Gets the editor.
     *
     * @return the editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * Sets the editor.
     *
     * @param editor the new editor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * Gets the pages.
     *
     * @return the pages
     */
    public String getPages() {
        return pages;
    }

    /**
     * Sets the pages.
     *
     * @param pages the new pages
     */
    public void setPages(String pages) {
        this.pages = pages;
    }

    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the volume.
     *
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the volume.
     *
     * @param volume the new volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * Gets the number.
     *
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the number.
     *
     * @param number the new number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets the month.
     *
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the month.
     *
     * @param month the new month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * Gets the url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     *
     * @param url the new url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets the ee.
     *
     * @return the ee
     */
    public String getEe() {
        return ee;
    }

    /**
     * Sets the ee.
     *
     * @param ee the new ee
     */
    public void setEe(String ee) {
        this.ee = ee;
    }

    /**
     * Gets the cdrom.
     *
     * @return the cdrom
     */
    public String getCdrom() {
        return cdrom;
    }

    /**
     * Sets the cdrom.
     *
     * @param cdrom the new cdrom
     */
    public void setCdrom(String cdrom) {
        this.cdrom = cdrom;
    }

    /**
     * Gets the citations.
     *
     * @return the citations
     */
    public List<String> getCitations() {
        return citations;
    }

    /**
     * Sets the citations.
     *
     * @param citations the new citations
     */
    public void setCitations(List<String> citations) {
        this.citations = citations;
    }

    /**
     * Gets the publisher.
     *
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher.
     *
     * @param publisher the new publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets the note.
     *
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the note.
     *
     * @param note the new note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Gets the crossref.
     *
     * @return the crossref
     */
    public String getCrossref() {
        return crossref;
    }

    /**
     * Sets the crossref.
     *
     * @param crossref the new crossref
     */
    public void setCrossref(String crossref) {
        this.crossref = crossref;
    }

    /**
     * Gets the isbn.
     *
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the isbn.
     *
     * @param isbn the new isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets the series.
     *
     * @return the series
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the series.
     *
     * @param series the new series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * Gets the school.
     *
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets the school.
     *
     * @param school the new school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Gets the chapter.
     *
     * @return the chapter
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * Sets the chapter.
     *
     * @param chapter the new chapter
     */
    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
}