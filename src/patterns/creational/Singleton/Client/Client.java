package patterns.creational.Singleton.Client;

import patterns.creational.Singleton.SharedResource.Db;

public class Client {
    public static void main(String[] args) {
        Db db=Db.getInstance();
        db.executeQuery("SELECT * FROM users;");


        Db sameInstance=Db.getInstance();

        sameInstance.executeQuery("SELECT * FROM users;");

        System.out.println(db==sameInstance);
    }
}
