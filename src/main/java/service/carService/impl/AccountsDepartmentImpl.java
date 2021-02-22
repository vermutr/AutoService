package service.carService.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.car.Car;
import service.action.impl.Notification;
import service.carService.Work;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDepartmentImpl implements Work {

    private int money;
    private final Notification notification=new Notification();


    @Override
    public void doYourWork(Car car) {
        notification.setMessage("Start count money for the work");
        System.out.println(notification);
        System.out.println("Your car: "+ car.getModel() + " " + car.getBrand());
        System.out.println("You should pay: " + money);
    }

}
