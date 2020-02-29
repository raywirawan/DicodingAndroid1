package com.example.submission.Models;

public class Artist {
    private String id, name, born, gender, occupation, desc, photo_link, wiki_name, instagram_name;

    public Artist(String id, String name, String born, String gender, String occupation, String desc, String photo_link, String wiki_name, String instagram_link) {
        this.name = name;
        this.occupation = occupation;
        this.desc = desc;
        this.photo_link = photo_link;
        this.id = id;
        this.born = born;
        this.gender = gender;
        this.wiki_name = wiki_name;
        this.instagram_name = instagram_link;
    }

    public String getName() {
        return name;
    }

    public String getId(){
        return id;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getDesc() {
        return desc;
    }

    public String getBorn() {
        return born;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoto_link() {
        return photo_link;
    }

    public String getWiki_name() {
        return wiki_name;
    }

    public String getInstagram_name() {
        return instagram_name;
    }
}
