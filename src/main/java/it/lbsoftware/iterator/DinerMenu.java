package it.lbsoftware.iterator;

import java.util.Iterator;
import lombok.extern.java.Log;

@Log
public class DinerMenu implements Menu {

  private static final int MAX_ITEMS = 3;
  private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];
  private int numberOfItems = 0;

  public DinerMenu() {
    addItem("Margherita pizza", "A real italian pizza", true, 4.00);
    addItem("Tagliatelle with ragu", "A real italian pasta dish", false, 4.50);
    addItem("Pasta with tomato sauce", "A real italian vegetarian pasta dish", true, 4.50);
  }

  public void addItem(
      final String name, final String description, final boolean vegetarian, final double price) {
    if (numberOfItems >= MAX_ITEMS) {
      log.info("Could not add item to the menu because it has reached its limit of " + MAX_ITEMS);
      return;
    }
    var menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems[numberOfItems] = menuItem;
    numberOfItems++;
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
