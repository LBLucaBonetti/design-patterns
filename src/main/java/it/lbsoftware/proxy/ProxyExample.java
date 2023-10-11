package it.lbsoftware.proxy;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class ProxyExample extends DesignPatternExample {

  public static void main(String[] args) {
    new ProxyExample().showExample();
  }

  @Override
  public void doExample() {
    var videoStreamingService = new VideoStreamingService();
    var proxy = new VideoStreamingCacheProxy(videoStreamingService);

    log.info("Accessing a video without the proxy twice...");
    long elapsedTime = accessAVideoTwice(videoStreamingService, "1");
    log.info("Accessing a video without the proxy twice took " + elapsedTime + " ms");

    log.info("Accessing a video with the proxy twice...");
    elapsedTime = accessAVideoTwice(proxy, "2");
    log.info("Accessing a video with the proxy twice took " + elapsedTime + " ms");

    log.info("Accessing popular videos without the proxy twice...");
    elapsedTime = accessPopularVideosTwice(videoStreamingService);
    log.info("Accessing popular videos without the proxy twice took " + elapsedTime + " ms");

    log.info("Accessing popular videos with the proxy twice...");
    elapsedTime = accessPopularVideosTwice(proxy);
    log.info("Accessing popular videos with the proxy twice took " + elapsedTime + " ms");
  }

  private long accessAVideoTwice(
      final VideoStreamingLibrary videoStreamingLibrary, final String id) {
    try {
      long startTime = System.currentTimeMillis();
      videoStreamingLibrary.getVideo(id);
      videoStreamingLibrary.getVideo(id);
      long endTime = System.currentTimeMillis();
      return endTime - startTime;
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    return -1;
  }

  private long accessPopularVideosTwice(final VideoStreamingLibrary videoStreamingLibrary) {
    try {
      long startTime = System.currentTimeMillis();
      videoStreamingLibrary.getPopularVideos();
      videoStreamingLibrary.getPopularVideos();
      long endTime = System.currentTimeMillis();
      return endTime - startTime;
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    return -1;
  }
}
