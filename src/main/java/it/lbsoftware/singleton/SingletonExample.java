package it.lbsoftware.singleton;

import it.lbsoftware.DesignPatternExample;
import lombok.extern.java.Log;

@Log
public class SingletonExample extends DesignPatternExample {

  private static final String DATABASE_CONNECTION_1_OPEN_QUESTION =
      "Is database connection 1 open? ";
  private static final String DATABASE_CONNECTION_2_OPEN_QUESTION =
      "Is database connection 2 open? ";

  public static void main(String[] args) {
    new SingletonExample().showExample();
  }

  @Override
  public void doExample() {
    DatabaseConnection databaseConnection1 = DatabaseConnection.INSTANCE;
    DatabaseConnection databaseConnection2 = DatabaseConnection.INSTANCE;
    log.info("We would like only one database connection for the whole app");
    log.info(DATABASE_CONNECTION_1_OPEN_QUESTION + databaseConnection1.isOpen());
    log.info(DATABASE_CONNECTION_2_OPEN_QUESTION + databaseConnection2.isOpen());
    databaseConnection1.open();
    log.info(DATABASE_CONNECTION_1_OPEN_QUESTION + databaseConnection1.isOpen());
    log.info(DATABASE_CONNECTION_2_OPEN_QUESTION + databaseConnection2.isOpen());
    databaseConnection2.close();
    log.info(DATABASE_CONNECTION_1_OPEN_QUESTION + databaseConnection1.isOpen());
    log.info(DATABASE_CONNECTION_2_OPEN_QUESTION + databaseConnection2.isOpen());
  }
}
