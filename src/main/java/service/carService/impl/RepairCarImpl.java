package service.carService.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.car.Car;
import service.action.impl.Notification;
import service.carService.Work;

@Data
@NoArgsConstructor
public class RepairCarImpl implements Work {


    /*
    также может быть наследование какая часть машины должна быть починена(двигатель, тормоза и т.д.) или просто диагностика
     */

    private final Notification notification=new Notification();

    @Override
    public void doYourWork(Car car) {
        notification.setMessage("Start fixing");
        System.out.println(notification);
        System.out.println("Your car: "+ car.getModel() + " " + car.getBrand());
        System.out.println("Car is fixing");
        notification.setMessage("I am done");
        System.out.println(notification);
    }
}
