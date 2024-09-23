package musicplayer;

public class MusicPlayerFacade {
    private MusicSource localFile;
    private MusicSource onlineStreamingService;
    private MusicSource radioStation;

    public void playLocalFile(String fileName) {
        localFile = new LocalFile(fileName);
        localFile.play();
    }

    public void streamFromURL(String url) {
        onlineStreamingService = new OnlineStreamingService(url);
        onlineStreamingService.play();
    }

    public void playRadioStation(String stationName) {
        radioStation = new RadioStation(stationName);
        radioStation.play();
    }
}
