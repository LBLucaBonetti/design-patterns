package it.lbsoftware.templatemethod;

import lombok.extern.java.Log;

@Log
public abstract class CaffeineBeverage {

  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  protected abstract void brew();

  protected abstract void addCondiments();

  private void boilWater() {
    log.info("Boiling water");
  }

  private void pourInCup() {
    log.info("Pouring into cup");
  }

  protected boolean customerWantsCondiments() {
    return false;
  }
}
