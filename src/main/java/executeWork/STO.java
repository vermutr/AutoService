package executeWork;

import model.car.Car;
import model.stuff.Employees;
import model.stuff.EmployeesStatus;
import model.stuff.Profession;
import service.carService.Work;
import service.carService.impl.RepairCarImpl;
import service.stuff.impl.RepairStuff;

import java.util.ArrayList;
import java.util.List;

public class STO {
    private final List<Employees> employeesList=new ArrayList<>();
    private final RepairCarImpl repairCar=new RepairCarImpl();
    private final RepairStuff repairStuff = new RepairStuff();

    public void getEmployeesList(){
        Employees employees=new Employees("Vasia", "Terkin", Profession.REPAIR, EmployeesStatus.FREE);
        Employees employees1=new Employees("Kolya", "Trinichin", Profession.WASHER, EmployeesStatus.FREE);
        employeesList.add(employees);
        employeesList.add(employees1);
    }

    public void executeRepair(Car car, Work work){


        System.out.println("We can repair your car, let's start");
        repairStuff.qualification(employeesList.get(0));
        repairCar.doYourWork(car);
    }

    public void executeWash( Car car, Work work){

        System.out.println("We can wash your car, let's start");
        repairStuff.qualification(employeesList.get(1));
        work.doYourWork(car);
    }

}
