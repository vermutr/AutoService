package service.carService.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.car.Car;
import service.action.impl.Notification;
import service.carService.Work;


@Data
@NoArgsConstructor
public class WashCarImpl implements Work {
    /*
    от этого класса может быть наследование типа какая мойка нужна
    более професиональная или менее, но не знаю как это по пакетам распихать, чтобы красиво было
     */

    private final Notification notification=new Notification();

    @Override
    public void doYourWork(Car car) {
        notification.setMessage("Start cleaning");
        System.out.println(notification);
        System.out.println("Your car: "+ car.getBrand() + " " + car.getModel());
        System.out.println("Car is cleaning");
        notification.setMessage("I am done");
        System.out.println(notification);
    }
}
