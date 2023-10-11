package it.lbsoftware.proxy;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.java.Log;

@Log
public class VideoStreamingCacheProxy implements VideoStreamingLibrary {

  private final VideoStreamingLibrary videoStreamingLibrary;
  private final Map<String, Video> videoCache;
  private Map<String, Video> popularVideoCache;

  public VideoStreamingCacheProxy(final VideoStreamingLibrary videoStreamingLibrary) {
    this.videoStreamingLibrary = videoStreamingLibrary;
    this.popularVideoCache = new HashMap<>();
    this.videoCache = new HashMap<>();
  }

  @Override
  public Map<String, Video> getPopularVideos() throws InterruptedException {
    if (popularVideoCache.isEmpty()) {
      popularVideoCache = videoStreamingLibrary.getPopularVideos();
    } else {
      log.info("Cache hit for popular videos!");
    }
    return popularVideoCache;
  }

  @Override
  public Video getVideo(final String id) throws InterruptedException {
    var video = videoCache.get(id);
    if (video == null) {
      video = videoStreamingLibrary.getVideo(id);
      videoCache.put(id, video);
    } else {
      log.info("Cache hit for video with id " + id);
    }
    return video;
  }
}
