package it.lbsoftware.iterator;

import java.util.Iterator;
import java.util.List;
import lombok.extern.java.Log;

@Log
public class Waitress {

  private final List<Menu> menus;

  public Waitress(final List<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
    for (Menu menu : menus) {
      printMenu(menu.createIterator());
    }
  }

  private void printMenu(final Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      log.info(menuItem.name() + ", " + menuItem.price() + " -- " + menuItem.description());
    }
  }
}
