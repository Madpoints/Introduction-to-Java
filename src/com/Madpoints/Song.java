package com.Madpoints;

public class Song {
    private String title;
    private String duration;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String songInfo() {
        return this.title + " " + this.duration;
    }
}
