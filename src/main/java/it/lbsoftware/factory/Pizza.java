package it.lbsoftware.factory;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.java.Log;

@Log
public class Pizza {

  protected String name;
  protected String dough;
  protected String sauce;
  protected List<String> toppings = new ArrayList<>();

  public void prepare() {
    log.info("Preparing " + name);
    log.info("Tossing dough...");
    log.info("Adding sauce...");
    log.info("Adding toppings: ");
    toppings.forEach(log::info);
  }

  public void bake() {
    log.info("Bake for 3 minutes at the highest temperature your oven can reach");
  }

  public void cut() {
    log.info("Cutting the pizza in 8 slices");
  }

  public void box() {
    log.info("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }
}
