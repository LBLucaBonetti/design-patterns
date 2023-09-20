package it.lbsoftware.decorator;

import java.math.BigDecimal;

public abstract class Beverage {
  protected String description = "Unknown beverage";

  public String getDescription() {
    return description;
  }

  public abstract BigDecimal cost();
}
