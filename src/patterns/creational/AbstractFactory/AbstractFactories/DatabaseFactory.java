package patterns.creational.AbstractFactory.AbstractFactories;

import patterns.creational.AbstractFactory.AbstractProducts.Connection;
import patterns.creational.AbstractFactory.AbstractProducts.Query;

public interface  DatabaseFactory {
    Connection createConnection();

    Query createQuery();
}
