package LinkedlistscenarioBased;

import java.util.ArrayDeque;
import java.util.Deque;
public class musicplaylist {

    static class Song {
        private final String title;
        Song(String title) { this.title = title; }
        @Override public String toString() { return title; }
    }

    static class Playlist {
        private final Deque<Song> queue = new ArrayDeque<>();

        public void addSong(Song s) { queue.offerLast(s); }
        public Song playNext() { return queue.pollFirst(); }
        public Song peekNext() { return queue.peekFirst(); }
        public boolean removeSong(String title) {
            return queue.removeIf(s -> s.title.equals(title));
        }
        public boolean isEmpty() { return queue.isEmpty(); }
    }

    public static void main(String[] args) {
        Playlist p = new Playlist();
        p.addSong(new Song("Imagine"));
        p.addSong(new Song("Bohemian Rhapsody"));
        p.addSong(new Song("Stairway to Heaven"));

        while (!p.isEmpty()) {
            System.out.println("Playing: " + p.playNext());
        }
        p.addSong(new Song("Hotel California"));
        System.out.println("Up next: " + p.peekNext());
    }
}
