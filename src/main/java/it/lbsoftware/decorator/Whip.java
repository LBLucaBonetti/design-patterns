package it.lbsoftware.decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

  public Whip(final Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public BigDecimal cost() {
    return beverage.cost().add(new BigDecimal("0.15"));
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
