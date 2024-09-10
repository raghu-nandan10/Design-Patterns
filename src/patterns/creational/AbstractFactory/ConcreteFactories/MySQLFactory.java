package patterns.creational.AbstractFactory.ConcreteFactories;

import patterns.creational.AbstractFactory.AbstractFactories.DatabaseFactory;
import patterns.creational.AbstractFactory.AbstractProducts.Connection;
import patterns.creational.AbstractFactory.AbstractProducts.Query;
import patterns.creational.AbstractFactory.ConcreteProducts.MySQLConnection;
import patterns.creational.AbstractFactory.ConcreteProducts.MySqlQuery;

public class MySQLFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
