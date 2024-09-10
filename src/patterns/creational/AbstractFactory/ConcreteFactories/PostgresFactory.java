package patterns.creational.AbstractFactory.ConcreteFactories;

import patterns.creational.AbstractFactory.AbstractFactories.DatabaseFactory;
import patterns.creational.AbstractFactory.AbstractProducts.Connection;
import patterns.creational.AbstractFactory.AbstractProducts.Query;
import patterns.creational.AbstractFactory.ConcreteProducts.PostgresConnection;
import patterns.creational.AbstractFactory.ConcreteProducts.PostgresQuery;

public class PostgresFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}
