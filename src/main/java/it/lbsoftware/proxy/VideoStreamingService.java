package it.lbsoftware.proxy;

import java.util.Map;
import lombok.extern.java.Log;

@Log
public class VideoStreamingService implements VideoStreamingLibrary {

  private static final String BASE_URL = "https://videostreaming.com";

  @Override
  public Map<String, Video> getPopularVideos() throws InterruptedException {
    connectToServer(BASE_URL);
    return getRandomVideos();
  }

  @Override
  public Video getVideo(final String id) throws InterruptedException {
    connectToServer(BASE_URL + "/" + id);
    return getRandomVideo(id);
  }

  private void connectToServer(final String baseUrl) throws InterruptedException {
    log.info("Connecting to " + baseUrl + " ...");
    experienceNetworkLatency();
    log.info("Successfully connected to " + baseUrl);
  }

  private void experienceNetworkLatency() throws InterruptedException {
    Thread.sleep(500);
  }

  private Map<String, Video> getRandomVideos() throws InterruptedException {
    log.info("Loading popular videos...");
    experienceNetworkLatency();
    var randomVideos =
        Map.of(
            "First video",
            new Video("v1", "First video"),
            "Second video",
            new Video("v2", "Second video"),
            "Third video",
            new Video("v3", "Third video"));
    log.info("Finished loading popular videos");
    return randomVideos;
  }

  private Video getRandomVideo(final String id) throws InterruptedException {
    log.info("Loading video with id " + id);
    experienceNetworkLatency();
    var randomVideo = new Video(id, id + " video");
    log.info("Finished loading video with id " + id);
    return randomVideo;
  }
}
