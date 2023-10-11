package it.lbsoftware.proxy;

import java.util.Map;

public interface VideoStreamingLibrary {

  Map<String, Video> getPopularVideos() throws InterruptedException;

  Video getVideo(String id) throws InterruptedException;
}
