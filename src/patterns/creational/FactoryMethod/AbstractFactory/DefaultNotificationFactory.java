package patterns.creational.FactoryMethod.AbstractFactory;

import patterns.creational.FactoryMethod.AbstractProducts.Notification;

public  abstract class DefaultNotificationFactory {

    public abstract Notification create(String type);

    public void send(String channel){
        Notification notification=create(channel);
        notification.send("raghunandan.officials@gmail.com");
    }

}
