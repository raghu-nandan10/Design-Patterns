package patterns.creational.AbstractFactory.ConcreteProducts;

import patterns.creational.AbstractFactory.AbstractProducts.Connection;

public class PostgresConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connected to Postgres database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Postgres database...");
    }
}
