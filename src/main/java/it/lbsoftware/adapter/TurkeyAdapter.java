package it.lbsoftware.adapter;

import java.util.stream.IntStream;

public class TurkeyAdapter implements Duck {

  private final Turkey turkey;

  public TurkeyAdapter(final Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    // To fly the same distance a "normal" duck flies, the turkey has to fly five times
    IntStream.range(0, 5).forEach((int i) -> turkey.fly());
  }
}
