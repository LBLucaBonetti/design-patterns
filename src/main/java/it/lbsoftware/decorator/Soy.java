package it.lbsoftware.decorator;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

  public Soy(final Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public BigDecimal cost() {
    return beverage.cost().add(new BigDecimal("0.30"));
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
