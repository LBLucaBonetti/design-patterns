package it.lbsoftware.singleton;

import lombok.extern.java.Log;

@Log
public enum DatabaseConnection {
  INSTANCE;
  private boolean isOpen = false;

  public void open() {
    isOpen = true;
    log.info("Database connection opened!");
  }

  public void close() {
    isOpen = false;
    log.info("Database connection closed!");
  }

  public boolean isOpen() {
    return isOpen;
  }
}
