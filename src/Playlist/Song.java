package Playlist;

public class Song {
    private String name;
    private int lengthInSeconds;

    public Song(String name, int lengthInSeconds) {
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }
}
