package config;

import model.car.Car;
import model.car.HatchBackCar;
import model.stuff.Employee;
import model.stuff.EmployeeStatus;
import model.stuff.Profession;
import service.action.impl.Notification;
import service.carService.Work;
import service.carService.impl.RepairCarImpl;
import service.sto.Sto;
import service.stuff.Stuff;
import service.stuff.impl.RegisterNewStuff;
import service.stuff.impl.RepairStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ApiConfiguration {

    public ApiConfiguration() {
    }

    public Notification notification(){
        return new Notification();
    }

    public Work work(final Notification notification){
        return new RepairCarImpl(notification);
    }

    public Stuff stuff(){
        return new RepairStuff();
    }

    public Car car(){
        return new HatchBackCar(1,"Mercedes Benz","E290");
    }

    public RegisterNewStuff listOfStuff(){
        List<Employee> employeeList = new ArrayList<>();
        Employee employee =new Employee("Vasia", "Terkin", Profession.REPAIR, EmployeeStatus.FREE);
        Employee employee1 =new Employee("Kolya", "Trinichin", Profession.WASHER, EmployeeStatus.FREE);
        Employee employee2 =new Employee("Marina", "Aleksandrowa", Profession.REPAIR, EmployeeStatus.FREE);
        Employee employee3 =new Employee("Petia", "Tsumbal", Profession.WASHER, EmployeeStatus.FREE);
        Employee employee4 =new Employee("Misza", "Tkaczuk", Profession.REPAIR, EmployeeStatus.FREE);
        Employee employee5 =new Employee("Dima", "Vasiliev", Profession.WASHER, EmployeeStatus.FREE);
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        return new RegisterNewStuff(employeeList);
    }


    public Sto sto(final RegisterNewStuff registerNewStuff){
        return new Sto(registerNewStuff);
    }
}
