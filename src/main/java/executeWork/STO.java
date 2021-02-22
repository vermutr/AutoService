package executeWork;

import model.car.Car;
import executeWork.stuff.Employee;
import executeWork.stuff.EmployeeStatus;
import executeWork.stuff.Profession;
import service.carService.Work;
import service.carService.impl.RepairCarImpl;
import service.stuff.impl.RepairStuff;
import service.stuff.impl.WasherStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class STO {
    private final List<Employee> employeeList =new ArrayList<>();
    private final List<Employee> freeRepairEmployees=new ArrayList<>();
    private final List<Employee> freeWasherEmployees=new ArrayList<>();


    private final RepairCarImpl repairCar=new RepairCarImpl();
    private final RepairStuff repairStuff = new RepairStuff();
    private final WasherStuff washerStuff = new WasherStuff();

    public void getEmployeesList(){
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

    }

    public void executeRepair(Car car, Work work){
        System.out.println("We can repair your car, let's start");
        for(Employee employee:employeeList){
            if(employee.getProfession()==Profession.REPAIR && employee.getEmployeeStatus()==EmployeeStatus.FREE){
                freeRepairEmployees.add(employee);
            }
        }
        int item = new Random().nextInt(freeRepairEmployees.size());
        repairStuff.qualification(freeRepairEmployees.get(item));
        work.doYourWork(car);
    }

    public void executeWash( Car car, Work work){

        System.out.println("We can wash your car, let's start");
        for(Employee employee:employeeList){
            if(employee.getProfession()==Profession.WASHER && employee.getEmployeeStatus()==EmployeeStatus.FREE){
                freeWasherEmployees.add(employee);
            }
        }
        int item = new Random().nextInt(freeWasherEmployees.size());
        washerStuff.qualification(freeWasherEmployees.get(item));
        work.doYourWork(car);
    }

}
