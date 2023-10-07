package it.lbsoftware.composite;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.java.Log;

@Log
public class Menu extends MenuComponent {

  private final List<MenuComponent> menuComponents = new ArrayList<>();
  private final String name;
  private final String description;

  public Menu(final String name, final String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(final MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public void remove(final MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(final int i) {
    return menuComponents.get(i);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print() {
    log.info(System.lineSeparator());
    String stringBuilder = getName() + ", " + getDescription() + "  ---------------";
    log.info(stringBuilder);
    for (MenuComponent menuComponent : menuComponents) {
      menuComponent.print();
    }
  }
}
