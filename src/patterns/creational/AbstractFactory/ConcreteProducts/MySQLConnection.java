package patterns.creational.AbstractFactory.ConcreteProducts;

import patterns.creational.AbstractFactory.AbstractProducts.Connection;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL database...");
    }

}
