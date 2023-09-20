package it.lbsoftware.decorator;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast";
  }

  @Override
  public BigDecimal cost() {
    return new BigDecimal("1.85");
  }
}
