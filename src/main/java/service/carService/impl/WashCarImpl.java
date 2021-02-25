package service.carService.impl;

import lombok.Data;
import model.car.Car;
import service.action.impl.Notification;
import service.carService.Work;

@Data
public class WashCarImpl implements Work {

    /*
    от этого класса может быть наследование типа какая мойка нужна
    более професиональная или менее, но не знаю как это по пакетам распихать, чтобы красиво было
     */

    private final Notification notification;

    public WashCarImpl(final Notification notification) {
        this.notification = notification;
    }

    @Override
    public void doYourWork(final Car car) {
        notification.setMessage("Start cleaning");
        notification.doSomething();
        car.representCar();
        System.out.println("Car is cleaning");
        notification.setMessage("I am done");
        notification.doSomething();
    }
}
