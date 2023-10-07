package it.lbsoftware.composite;

import it.lbsoftware.DesignPatternExample;

public class CompositeExample extends DesignPatternExample {

  public static void main(String[] args) {
    new CompositeExample().showExample();
  }

  @Override
  public void doExample() {
    MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
    MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
    MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner");
    MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert of course!");
    MenuComponent coffeeMenu = new Menu("Coffee menu", "Whenever you need it");

    MenuComponent allMenus = new Menu("All menus", "All menus combined");

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    pancakeHouseMenu.add(new MenuItem("Nutella pancake", "A pancake with Nutella", true, 2.50));
    pancakeHouseMenu.add(new MenuItem("Oreo pancake", "A pancake with Oreo", true, 2.50));
    pancakeHouseMenu.add(new MenuItem("Bacon pancake", "A pancake with bacon", false, 3.00));

    dinerMenu.add(new MenuItem("Margherita pizza", "A real italian pizza", true, 4.00));
    dinerMenu.add(new MenuItem("Tagliatelle with ragu", "A real italian pasta dish", false, 4.50));
    dinerMenu.add(
        new MenuItem(
            "Pasta with tomato sauce", "A real italian vegetarian pasta dish", true, 4.50));

    dinerMenu.add(dessertMenu);

    dessertMenu.add(
        new MenuItem(
            "Apple pie", "Apple pie with crust, topped with vanilla ice cream", true, 1.59));
    dessertMenu.add(new MenuItem("Ice cream", "A real italian gelato (aka ice cream)", true, 3.00));

    cafeMenu.add(
        new MenuItem(
            "Veggie burger and air fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true,
            3.99));
    cafeMenu.add(
        new MenuItem(
            "Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
    cafeMenu.add(
        new MenuItem(
            "Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

    cafeMenu.add(coffeeMenu);

    coffeeMenu.add(
        new MenuItem("Coffee cake", "Crumbly cake topped with cinnamon and walnuts", true, 1.59));
    coffeeMenu.add(
        new MenuItem(
            "Bagel", "Flavors include sesame, poppy-seed, cinnamon raisin, pumpkin", false, 0.69));
    coffeeMenu.add(
        new MenuItem("Biscotti", "Three almond or hazelnut biscuit cookies", true, 0.89));

    Waitress waitress = new Waitress(allMenus);
    waitress.printMenu();
  }
}
