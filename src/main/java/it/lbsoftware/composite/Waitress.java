package it.lbsoftware.composite;

public class Waitress {

  private final MenuComponent allMenus;

  public Waitress(final MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    allMenus.print();
  }
}
