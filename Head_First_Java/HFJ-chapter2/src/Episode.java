class Episode {
    int seriesNumber;
    int episodeNumber;
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
    void play() {
        System.out.println("Playing episode " + episodeNumber + " from series " + seriesNumber );
    }
}
class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.episodeNumber = 1;
        episode.play();
        episode.skipIntro();
        episode.skipToNext();
    }
}