package patterns.creational.AbstractFactory.Client;

import patterns.creational.AbstractFactory.AbstractFactories.DatabaseFactory;
import patterns.creational.AbstractFactory.AbstractProducts.Connection;
import patterns.creational.AbstractFactory.AbstractProducts.Query;
import patterns.creational.AbstractFactory.ConcreteFactories.MySQLFactory;
import patterns.creational.AbstractFactory.ConcreteFactories.PostgresFactory;

public class Client {
    public static void main(String[] args) {
       String database=System.getenv("database");
        DatabaseFactory databaseFactory=null;
        if(database == null || database.equals("postgres")){
            databaseFactory=new PostgresFactory();
        }else{
            databaseFactory=new MySQLFactory();
        }

        Connection connection=databaseFactory.createConnection();
        connection.connect();

        Query query=databaseFactory.createQuery();
        query.execute("SELECT * FROM users;");

        connection.disconnect();



    }
}
