package patterns.creational.FactoryMethod.ConcreteProducts;

import patterns.creational.FactoryMethod.AbstractProducts.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String email) {
        System.out.println("Sent Notification to "+email+" through Email");
    }
}
