package com.digitalnao.googlescholarapi.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity(name = "AUTHOR")
public class AuthorEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "AUTHOR_ID")
    private String authorId;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "AFFILIATIONS")
    private String affiliations;

    @Basic
    @Column(name = "EMAIL")
    private String email;

    @Basic
    @Column(name = "THUMBNAIL")
    private String thumbnail;

    @Basic
    @Column(name = "GOOGLE_SCHOLAR_ID")
    private String googleScholarAuthorId;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(String affiliations) {
        this.affiliations = affiliations;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getGoogleScholarAuthorId() {
        return googleScholarAuthorId;
    }

    public void setGoogleScholarAuthorId(String googleScholarAuthorId) {
        this.googleScholarAuthorId = googleScholarAuthorId;
    }
}
