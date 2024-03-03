package com.example.demo.model;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
    }

    public Integer getLikes() {
        return this.likes;
    }
    public String getText() {
        return this.text;
    }
}