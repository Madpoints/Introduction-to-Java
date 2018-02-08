package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        Album album = new Album("Dio", "Holy Diver");
        album.addSong(new Song("Holy Diver", "3:35"));
        album.addSong(new Song("Caught in the Middle", "5:05"));
        album.addSong(new Song("Shame on the Night", "7:32"));

        album.trackList();
    }
}
