package it.lbsoftware.abstractfactory;

public class NeapolitanPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new CirioSauce();
  }

  @Override
  public Cheese createCheese() {
    return new RealMozzarellaCheese();
  }

  @Override
  public Ham createHam() {
    return new CookedHam();
  }

  @Override
  public Anchovy createAnchovy() {
    return new FreshAnchovies();
  }
}
