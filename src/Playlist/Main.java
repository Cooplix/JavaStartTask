package Playlist;

public class Main {
    public static void main(String[] args) {
        Song ul = new Song("ul", 325);
        Song ul1 = new Song("ul1", 352);
        Song ul2 = new Song("ul2", 220);
        Song ul3 = new Song("ul3", 6200);

        Plalist plalist = new Plalist();
        System.out.println(plalist.getTime(plalist.playlistLength(ul, ul1, ul2, ul3)));
    }
}
