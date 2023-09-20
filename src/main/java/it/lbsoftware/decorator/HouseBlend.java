package it.lbsoftware.decorator;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend";
  }

  @Override
  public BigDecimal cost() {
    return new BigDecimal("0.89");
  }
}
