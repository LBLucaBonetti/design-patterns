package it.lbsoftware.abstractfactory;

public class ModenesePizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MuttiSauce();
  }

  @Override
  public Cheese createCheese() {
    return new FakeMozzarellaCheese();
  }

  @Override
  public Ham createHam() {
    return new RawHam();
  }

  @Override
  public Anchovy createAnchovy() {
    return new FrozenAnchovies();
  }
}
