package it.lbsoftware.factorymethod;

import lombok.extern.java.Log;

@Log
public class TerronianPizza extends Pizza {

  public TerronianPizza() {
    name = "Terronian pizza";
    dough = "Thick crust dough";
    sauce = "Cirio sauce";
    toppings.add("Real mozzarella");
  }

  @Override
  public void cut() {
    log.info("Cutting the pizza in 4 slices");
  }
}
