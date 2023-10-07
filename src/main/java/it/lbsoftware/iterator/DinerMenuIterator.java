package it.lbsoftware.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator<MenuItem> {

  private final MenuItem[] menuItems;
  private int position = 0;

  public DinerMenuIterator(final MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.length && menuItems[position] != null;
  }

  @Override
  public MenuItem next() {
    if (position >= menuItems.length) {
      throw new NoSuchElementException();
    }
    var menuItem = menuItems[position];
    position++;
    return menuItem;
  }
}
