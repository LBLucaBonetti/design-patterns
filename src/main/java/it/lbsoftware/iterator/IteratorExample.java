package it.lbsoftware.iterator;

import it.lbsoftware.DesignPatternExample;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.extern.java.Log;

@Log
public class IteratorExample extends DesignPatternExample {

  public static void main(String[] args) {
    new IteratorExample().showExample();
  }

  @Override
  public void doExample() {
    List<Menu> menus =
        new ArrayList<>(Set.of(new CafeMenu(), new PancakeHouseMenu(), new DinerMenu()));
    Waitress waitress = new Waitress(menus);
    waitress.printMenu();
  }
}
