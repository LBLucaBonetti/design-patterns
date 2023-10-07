package it.lbsoftware.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

  private final Map<String, MenuItem> menuItems = new HashMap<>();

  public CafeMenu() {
    addItem("Donut", "Homer Simpson would like this", true, 1.00);
    addItem("Espresso", "A real italian coffee", true, 1.00);
    addItem("Sausage", "A porky breakfast", false, 2.00);
  }

  public void addItem(
      final String name, final String description, final boolean vegetarian, final double price) {
    menuItems.put(name, new MenuItem(name, description, vegetarian, price));
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return menuItems.values().iterator();
  }
}
