package it.lbsoftware.factorymethod;

import java.util.Set;

public class ParmesanPizza extends Pizza {

  public ParmesanPizza() {
    name = "Polentonian pizza with raw ham";
    dough = "Thin crust dough";
    sauce = "Mutti sauce";
    toppings.addAll(Set.of("Fake mozzarella", "Raw ham"));
  }
}
