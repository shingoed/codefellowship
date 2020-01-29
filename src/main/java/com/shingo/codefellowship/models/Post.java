package com.shingo.codefellowship.models;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String body;
    String title;
    int createdAt;

    @ManyToOne
    ApplicationUser user;


//    default construc
    public Post(){}


    public Post(String body, String title, int createdAt, ApplicationUser user) {
        this.body = body;
        this.title =title;
        this.createdAt = createdAt;
        this.user =user;
    }

    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }


    public int getCreatedAt() {
        return createdAt;
    }
}
