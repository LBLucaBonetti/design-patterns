package it.lbsoftware.factorymethod;

public class NeapolitanPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    if ("marinara".equals(type)) {
      return new MarinaraPizza();
    }
    return new TerronianPizza();
  }
}
