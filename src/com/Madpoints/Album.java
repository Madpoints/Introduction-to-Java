package com.Madpoints;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String title;
    private SongList songs;

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.songs = new SongList();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void trackList() {
        this.songs.trackList();
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    private class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public Song findSong(String title) {
            for (Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }

            return null;
        }

        private void trackList() {
            for (Song track: this.songs) {
                System.out.println(track.songInfo());
            }
        }
    }
}
