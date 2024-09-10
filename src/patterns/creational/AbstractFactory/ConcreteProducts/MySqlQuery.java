package patterns.creational.AbstractFactory.ConcreteProducts;

import patterns.creational.AbstractFactory.AbstractProducts.Query;

public class MySqlQuery implements Query {
    @Override
    public void execute(String sql) {
        System.out.println("Executing MySql query : "+sql);
    }
}
