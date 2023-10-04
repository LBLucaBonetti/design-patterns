package it.lbsoftware.adapter;

import lombok.extern.java.Log;

@Log
public class WildTurkey implements Turkey {

  @Override
  public void gobble() {
    log.info("Gobble gobble");
  }

  @Override
  public void fly() {
    log.info("I'm flying a short distance");
  }
}
