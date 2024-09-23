package musicplayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayerFacade player = new MusicPlayerFacade();

        // Playing local file
        player.playLocalFile("favorite_song.mp3");

        // Streaming music from online service
        player.streamFromURL("https://example.com/stream");

        // Playing a radio station
        player.playRadioStation("Classic FM");
    }
}
