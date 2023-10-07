package it.lbsoftware.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

  private final List<MenuItem> menuItems = new ArrayList<>();

  public PancakeHouseMenu() {
    addItem("Nutella pancake", "A pancake with Nutella", true, 2.50);
    addItem("Oreo pancake", "A pancake with Oreo", true, 2.50);
    addItem("Bacon pancake", "A pancake with bacon", false, 3.00);
  }

  public void addItem(
      final String name, final String description, final boolean vegetarian, final double price) {
    menuItems.add(new MenuItem(name, description, vegetarian, price));
  }

  @Override
  public Iterator<MenuItem> createIterator() {
    return menuItems.iterator();
  }
}
