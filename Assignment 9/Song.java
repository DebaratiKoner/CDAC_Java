
package cdac;
class Song {
    int songId;
    String title;
    String artist;

    Song(int songId, String title, String artist) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
    }

    void display() {
        System.out.println("Song ID: " + songId);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
    }
}
