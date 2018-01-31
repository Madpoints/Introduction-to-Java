package com.Madpoints;

import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String title;
    private LinkedList<Song> songs;

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.songs = new LinkedList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void trackList() {
        Iterator<Song> track = this.songs.iterator();
        while (track.hasNext()) {
            System.out.println(track.next().songInfo());
        }
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
