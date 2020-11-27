package Playlist;

import java.text.SimpleDateFormat;

public class Plalist {
    private final int SECONDS_IN_HOUR = 60 * 60;
    private final int SECONDS_IN_MINUTE = 60;

    public int playlistLength(Song... songs) {
        int totalTime = 0;
        for (Song song: songs) {
            totalTime +=song.getLengthInSeconds();
        }
        return totalTime;
    }

    public String getTime(int seconds) {
        int hours = seconds / SECONDS_IN_HOUR;
        seconds %= SECONDS_IN_HOUR;
        int minute = seconds / SECONDS_IN_MINUTE;
        seconds %= SECONDS_IN_MINUTE;

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        return hours + ":" + minute + ":" + seconds;
    }


}
