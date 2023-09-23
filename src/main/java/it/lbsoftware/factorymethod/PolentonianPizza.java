package it.lbsoftware.factorymethod;

public class PolentonianPizza extends Pizza {

  public PolentonianPizza() {
    name = "Polentonian pizza";
    dough = "Thin crust dough";
    sauce = "Mutti sauce";
    toppings.add("Fake mozzarella");
  }
}
