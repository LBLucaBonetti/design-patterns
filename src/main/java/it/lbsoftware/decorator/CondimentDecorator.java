package it.lbsoftware.decorator;

public abstract class CondimentDecorator extends Beverage {
  protected Beverage beverage;

  @Override
  public abstract String getDescription();
}
