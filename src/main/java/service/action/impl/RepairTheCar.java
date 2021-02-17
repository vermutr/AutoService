package service.action.impl;

import model.Car;
import model.Employees;
import service.action.Action;
import service.stuff.impl.AccountsStuff;
import service.stuff.impl.RepairStuff;

public class RepairTheCar implements Action {


    /*
    также может быть наследование какая часть машины должна быть починена(двигатель, тормоза и т.д.) или просто диагностика
     */

    private final Notification notification=new Notification();
    private final RepairStuff stuff= new RepairStuff();
    private final Car car=new Car();
    private Employees employees; //создать лист можно и рандомно помещать в стаф типа кто свободен из работриков

    @Override
    public void doSomething() {
        stuff.qualification(employees);
        notification.setMessage("Start fixing");
        System.out.println(notification);
        System.out.println("Your car: "+ car);
        System.out.println("Car is fixing");
        notification.setMessage("I am done");
        System.out.println(notification);
    }
}
