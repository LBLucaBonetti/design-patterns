package it.lbsoftware.decorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

  public Mocha(final Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public BigDecimal cost() {
    return beverage.cost().add(new BigDecimal("0.20"));
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}
