package it.lbsoftware.factorymethod;

import java.util.Set;
import lombok.extern.java.Log;

@Log
public class MarinaraPizza extends Pizza {

  public MarinaraPizza() {
    name = "Terronian pizza with garlic, oregano and olive oil";
    dough = "Thick crust dough";
    sauce = "Cirio sauce";
    toppings.addAll(Set.of("Garlic", "Oregano", "Olive oil"));
  }

  @Override
  public void cut() {
    log.info("Cutting the pizza in 4 slices");
  }
}
