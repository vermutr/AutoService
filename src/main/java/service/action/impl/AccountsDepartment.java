package service.action.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.car.Car;
import executeWork.stuff.Employee;
import service.action.Action;
import service.stuff.impl.AccountsStuff;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDepartment implements Action {

    private int money;
    private final Notification notification=new Notification();
    private final Car car=new Car();
    private final AccountsStuff stuff = new AccountsStuff();
    private Employee employee; //создать лист можно и рандомно помещать в стаф типа кто свободен из работриков


    @Override
    public void doSomething() {
        stuff.qualification(employee);
        notification.setMessage("Start count money for the work");
        System.out.println(notification);
        System.out.println("Your car: "+ car);
        System.out.println("You should pay: " + money);
    }

}
