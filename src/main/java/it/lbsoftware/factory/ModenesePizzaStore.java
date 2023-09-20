package it.lbsoftware.factory;

public class ModenesePizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    if ("parmesan".equals(type)) {
      return new ParmesanPizza();
    }
    return new PolentonianPizza();
  }
}
