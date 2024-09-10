package patterns.creational.FactoryMethod.ConcreteProducts;

import patterns.creational.FactoryMethod.AbstractProducts.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send(String email) {
        System.out.println("Sent Notification to "+email+" through SMS");
    }
}
