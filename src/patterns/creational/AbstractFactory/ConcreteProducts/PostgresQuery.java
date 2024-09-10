package patterns.creational.AbstractFactory.ConcreteProducts;

import patterns.creational.AbstractFactory.AbstractProducts.Query;

public class PostgresQuery implements Query {
    @Override
    public void execute(String sql) {
        System.out.println("Executing PostgresSQL query : "+sql);
    }
}
