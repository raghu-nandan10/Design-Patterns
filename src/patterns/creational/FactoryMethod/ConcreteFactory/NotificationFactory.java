package patterns.creational.FactoryMethod.ConcreteFactory;

import patterns.creational.FactoryMethod.AbstractFactory.DefaultNotificationFactory;
import patterns.creational.FactoryMethod.AbstractProducts.Notification;
import patterns.creational.FactoryMethod.ConcreteProducts.EmailNotification;
import patterns.creational.FactoryMethod.ConcreteProducts.PushNotification;
import patterns.creational.FactoryMethod.ConcreteProducts.SmsNotification;

public class NotificationFactory extends DefaultNotificationFactory {
    @Override
    public Notification create(String type) {
       if(type.isEmpty() || type.equals("email")){
           return new EmailNotification();
       }else if(type.equals("push")){
           return new PushNotification();
       }else if(type.equals("sms")){
           return new SmsNotification();
       }
       return null;
    }
}
