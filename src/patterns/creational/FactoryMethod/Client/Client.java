package patterns.creational.FactoryMethod.Client;

import patterns.creational.FactoryMethod.ConcreteFactory.NotificationFactory;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();

        //for channel sms notificationFactory will return SmsNotification
        notificationFactory.send("sms");

        notificationFactory.send("push");

        notificationFactory.send("email");
    }
}
