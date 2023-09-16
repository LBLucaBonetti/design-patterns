package it.lbsoftware;

public abstract class DesignPatternExample {
  protected final void showExample() {
    setupLogger();
    doExample();
  }

  private void setupLogger() {
    System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
  }

  public abstract void doExample();
}
