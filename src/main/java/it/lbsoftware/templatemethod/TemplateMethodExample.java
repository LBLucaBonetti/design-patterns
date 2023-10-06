package it.lbsoftware.templatemethod;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class TemplateMethodExample extends DesignPatternExample {

  public static void main(String[] args) {
    new TemplateMethodExample().showExample();
  }

  @Override
  public void doExample() {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();

    log.info("Making tea...");
    tea.prepareRecipe();

    log.info(System.lineSeparator());

    log.info("Making coffee...");
    coffee.prepareRecipe();
  }
}
