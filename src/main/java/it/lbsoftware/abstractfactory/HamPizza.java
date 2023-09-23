package it.lbsoftware.abstractfactory;

import lombok.extern.java.Log;

@Log
public class HamPizza extends Pizza {
  private final PizzaIngredientFactory pizzaIngredientFactory;

  public HamPizza(final PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepare() {
    log.info("Preparing " + getName());
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    ham = pizzaIngredientFactory.createHam();
  }
}
