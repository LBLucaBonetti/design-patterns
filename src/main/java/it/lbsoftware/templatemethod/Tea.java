package it.lbsoftware.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import lombok.extern.java.Log;

@Log
public class Tea extends CaffeineBeverage {

  @Override
  protected void brew() {
    log.info("Steeping the tea");
  }

  @Override
  protected void addCondiments() {
    log.info("Adding lemon");
  }

  @Override
  protected boolean customerWantsCondiments() {
    final String answer = getUserInput();
    return isYes(answer);
  }

  private String getUserInput() {
    log.info("Would you like lemon with your tea (y/n)? ");
    var in = new BufferedReader(new InputStreamReader(System.in));
    try {
      return in.readLine();
    } catch (IOException e) {
      log.severe("I/O error trying to read your answer");
    }
    return "";
  }

  private boolean isYes(final String answer) {
    return "y".equalsIgnoreCase(answer);
  }
}
