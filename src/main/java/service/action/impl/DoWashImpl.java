package service.action.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.Car;
import model.Employees;
import service.action.Action;
import service.stuff.Stuff;
import service.stuff.impl.WasherStuff;

import java.util.List;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class DoWashImpl implements Action {
    /*
    от этого класса может быть наследование типа какая мойка нужна
    более професиональная или менее, но не знаю как это по пакетам распихать, чтобы красиво было
     */

    private final WasherStuff stuff=new WasherStuff();
    private final Notification notification=new Notification();
    private final Car car=new Car();
    private Employees employees; //создать лист можно и рандомно помещать в стаф типа кто свободен из работриков

    @Override
    public void doSomething() {
        stuff.qualification(employees);
        notification.setMessage("Start cleaning");
        System.out.println(notification);
        System.out.println("Your car: "+ car);
        System.out.println("Car is cleaning");
        notification.setMessage("I am done");
        System.out.println(notification);
    }
}
