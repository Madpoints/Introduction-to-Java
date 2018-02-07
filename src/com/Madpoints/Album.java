package com.Madpoints;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String title;

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        SongList songs = new SongList();
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

    private class SongList {
        private ArrayList<Song> songList = new ArrayList();

        public SongList() {
        }

        public void addSong(Song song) {
            this.songList.add(song);
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }
    }
}
