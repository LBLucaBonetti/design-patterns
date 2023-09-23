package it.lbsoftware.abstractfactory;

public class FakeMozzarellaCheese implements Cheese {

  @Override
  public String explain() {
    return "I am a fake mozzarella cheese";
  }
}
