package it.lbsoftware.abstractfactory;

import lombok.extern.java.Log;

@Log
public class BlankPizza extends Pizza {
  private final PizzaIngredientFactory pizzaIngredientFactory;

  public BlankPizza(final PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepare() {
    log.info("Preparing " + getName());
    dough = pizzaIngredientFactory.createDough();
  }
}
