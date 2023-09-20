package it.lbsoftware.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {

  public Espresso() {
    description = "Espresso";
  }

  @Override
  public BigDecimal cost() {
    return new BigDecimal("1.99");
  }
}
