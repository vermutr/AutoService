package service.carService.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.car.Car;
import service.action.impl.Notification;
import service.carService.Work;

@Data
public class RepairCarImpl implements Work {

    /*
    также может быть наследование какая часть машины должна быть починена(двигатель, тормоза и т.д.) или просто диагностика
     */

    private final Notification notification;

    public RepairCarImpl(final Notification notification) {
        this.notification = notification;
    }

    @Override
    public void doYourWork(final Car car) {
        notification.setMessage("Start fixing");
        notification.doSomething();
        car.representCar();
        System.out.println("Car is fixing");
        notification.setMessage("I am done");
        notification.doSomething();
    }
}
