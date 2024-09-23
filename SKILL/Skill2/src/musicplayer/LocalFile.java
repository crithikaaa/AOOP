package musicplayer;

public class LocalFile implements MusicSource {
    private String fileName;

    public LocalFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}
