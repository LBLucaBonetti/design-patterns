package it.lbsoftware.abstractfactory;

public class NeapolitanPizzaStore extends PizzaStore {

  private static final String PIZZA_STORE_TYPE = "Neapolitan";

  @Override
  protected Pizza createPizza(String type) {
    PizzaIngredientFactory pizzaIngredientFactory = new NeapolitanPizzaIngredientFactory();
    return switch (type) {
      case "margherita" -> {
        Pizza pizza = new MargheritaPizza(pizzaIngredientFactory);
        pizza.name = PIZZA_STORE_TYPE + " margherita pizza";
        yield pizza;
      }
      case "anchovies" -> {
        Pizza pizza = new AnchoviesPizza(pizzaIngredientFactory);
        pizza.name = PIZZA_STORE_TYPE + " anchovies pizza";
        yield pizza;
      }
      case "ham" -> {
        Pizza pizza = new HamPizza(pizzaIngredientFactory);
        pizza.name = PIZZA_STORE_TYPE + " ham pizza";
        yield pizza;
      }
      default -> {
        Pizza pizza = new BlankPizza(pizzaIngredientFactory);
        pizza.name = PIZZA_STORE_TYPE + " blank pizza";
        yield pizza;
      }
    };
  }
}
