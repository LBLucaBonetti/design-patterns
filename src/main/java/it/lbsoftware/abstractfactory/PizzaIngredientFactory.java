package it.lbsoftware.abstractfactory;

public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Ham createHam();

  Anchovy createAnchovy();
}
