package it.lbsoftware.composite;

import lombok.extern.java.Log;

@Log
public class MenuItem extends MenuComponent {

  private final String name;
  private final String description;
  private final boolean vegetarian;
  private final double price;

  public MenuItem(
      final String name, final String description, final boolean vegetarian, final double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
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
  public double getPrice() {
    return price;
  }

  @Override
  public boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  public void print() {
    StringBuilder stringBuilder = new StringBuilder(" ");
    stringBuilder.append(getName());
    if (isVegetarian()) {
      stringBuilder.append("(v)");
    }
    stringBuilder.append(", ");
    stringBuilder.append(getPrice());
    stringBuilder.append("    -- ");
    stringBuilder.append(getDescription());
    log.info(stringBuilder.toString());
  }
}
