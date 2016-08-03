/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.cgomez.xml.attributes.Address;
import com.cgomez.xml.attributes.Author;
import com.cgomez.xml.attributes.Booktitle;
import com.cgomez.xml.attributes.Cdrom;
import com.cgomez.xml.attributes.Chapter;
import com.cgomez.xml.attributes.Cite;
import com.cgomez.xml.attributes.Crossref;
import com.cgomez.xml.attributes.Editor;
import com.cgomez.xml.attributes.Ee;
import com.cgomez.xml.attributes.Isbn;
import com.cgomez.xml.attributes.Journal;
import com.cgomez.xml.attributes.Month;
import com.cgomez.xml.attributes.Note;
import com.cgomez.xml.attributes.Number;
import com.cgomez.xml.attributes.Pages;
import com.cgomez.xml.attributes.Publisher;
import com.cgomez.xml.attributes.School;
import com.cgomez.xml.attributes.Series;
import com.cgomez.xml.attributes.Title;
import com.cgomez.xml.attributes.Url;
import com.cgomez.xml.attributes.Volume;
import com.cgomez.xml.attributes.Year;

/**
 * AbstractBibliographicCitation.
 * 
 * @author <a href="mailto:andres1537@gmail.com">Carlos Gomez</a>
 * @since dl-java-1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "authorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter" })
public abstract class AbstractBibliographicCitation {

    /** The key. */
    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String key;

    /** The mdate. */
    @XmlAttribute(name = "mdate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mdate;

    /** The publtype. */
    @XmlAttribute(name = "publtype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String publtype;

    /** The reviewid. */
    @XmlAttribute(name = "reviewid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reviewid;

    /** The rating. */
    @XmlAttribute(name = "rating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rating;

    /**
     * The author or editor or title or booktitle or pages or year or address or
     * journal or volume or number or month or url or ee or cdrom or cite or
     * publisher or note or crossref or isbn or series or school or chapter.
     */
    @XmlElements({ @XmlElement(name = "author", type = Author.class), @XmlElement(name = "editor", type = Editor.class),
	    @XmlElement(name = "title", type = Title.class), @XmlElement(name = "booktitle", type = Booktitle.class),
	    @XmlElement(name = "pages", type = Pages.class), @XmlElement(name = "year", type = Year.class),
	    @XmlElement(name = "address", type = Address.class), @XmlElement(name = "journal", type = Journal.class),
	    @XmlElement(name = "volume", type = Volume.class), @XmlElement(name = "number", type = Number.class),
	    @XmlElement(name = "month", type = Month.class), @XmlElement(name = "url", type = Url.class), @XmlElement(name = "ee", type = Ee.class),
	    @XmlElement(name = "cdrom", type = Cdrom.class), @XmlElement(name = "cite", type = Cite.class),
	    @XmlElement(name = "publisher", type = Publisher.class), @XmlElement(name = "note", type = Note.class),
	    @XmlElement(name = "crossref", type = Crossref.class), @XmlElement(name = "isbn", type = Isbn.class),
	    @XmlElement(name = "series", type = Series.class), @XmlElement(name = "school", type = School.class),
	    @XmlElement(name = "chapter", type = Chapter.class) })
    protected List<Object> authorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter;

    /**
     * Gets the value of the key property.
     * 
     * @return the key possible object is {@link String }
     */
    public String getKey() {
	return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setKey(String value) {
	this.key = value;
    }

    /**
     * Gets the value of the mdate property.
     * 
     * @return the mdate possible object is {@link String }
     */
    public String getMdate() {
	return mdate;
    }

    /**
     * Sets the value of the mdate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMdate(String value) {
	this.mdate = value;
    }

    /**
     * Gets the value of the publtype property.
     * 
     * @return the publtype possible object is {@link String }
     */
    public String getPubltype() {
	return publtype;
    }

    /**
     * Sets the value of the publtype property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPubltype(String value) {
	this.publtype = value;
    }

    /**
     * Gets the value of the reviewid property.
     * 
     * @return the reviewid possible object is {@link String }
     */
    public String getReviewid() {
	return reviewid;
    }

    /**
     * Sets the value of the reviewid property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReviewid(String value) {
	this.reviewid = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return the rating possible object is {@link String }
     */
    public String getRating() {
	return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRating(String value) {
	this.rating = value;
    }

    /**
     * Gets the value of the
     * authorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter
     * property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the
     * authorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAuthorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter()
     * 	.add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * 
     * @return the author or editor or title or booktitle or pages or year or
     *         address or journal or volume or number or month or url or ee or
     *         cdrom or cite or publisher or note or crossref or isbn or series
     *         or school or chapter {@link Author } {@link Editor } {@link Title }
     *         {@link Booktitle } {@link Pages } {@link Year } {@link Address }
     *         {@link Journal } {@link Volume } {@link Number } {@link Month }
     *         {@link Url } {@link Ee } {@link Cdrom } {@link Cite }
     *         {@link Publisher } {@link Note } {@link Crossref } {@link Isbn }
     *         {@link Series } {@link School } {@link Chapter }
     */
    public List<Object> getAuthorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter() {
	if (authorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter == null) {
	    authorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter = new ArrayList<Object>();
	}
	return this.authorOrEditorOrTitleOrBooktitleOrPagesOrYearOrAddressOrJournalOrVolumeOrNumberOrMonthOrUrlOrEeOrCdromOrCiteOrPublisherOrNoteOrCrossrefOrIsbnOrSeriesOrSchoolOrChapter;
    }
}