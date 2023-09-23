package it.lbsoftware.abstractfactory;

import java.util.Optional;
import lombok.Getter;
import lombok.extern.java.Log;

@Log
public abstract class Pizza {

  private static final String NOT_PROVIDED = "not provided";
  protected Dough dough;
  protected Sauce sauce;
  protected Cheese cheese;
  protected Ham ham;
  protected Anchovy anchovy;
  @Getter protected String name;

  public abstract void prepare();

  public void bake() {
    log.info("Baking...");
  }

  public void cut() {
    log.info("Cutting...");
  }

  public void box() {
    log.info("Placin in the box...");
  }

  @Override
  public String toString() {
    return "Dough: "
        + explain(dough)
        + System.lineSeparator()
        + "Sauce: "
        + explain(sauce)
        + System.lineSeparator()
        + "Cheese: "
        + explain(cheese)
        + System.lineSeparator()
        + "Ham: "
        + explain(ham)
        + System.lineSeparator()
        + "Anchovy: "
        + explain(anchovy);
  }

  private String explain(Explain ingredient) {
    return Optional.ofNullable(ingredient).map(Explain::explain).orElse(NOT_PROVIDED);
  }
}
