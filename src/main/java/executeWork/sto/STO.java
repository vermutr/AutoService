package executeWork.sto;

import executeWork.stuff.Employee;
import executeWork.stuff.EmployeeStatus;
import executeWork.stuff.Profession;
import model.car.Car;
import service.carService.Work;
import service.stuff.Stuff;
import service.stuff.impl.ListOfStuff;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class STO {

    private final ListOfStuff listOfStuff = new ListOfStuff();

    public Employee getRandomEmployee(List<Employee> employees, String nameOfWork){
        int item;
        List<Employee> employeeList;
        if(nameOfWork.equals("Wash")){
            employeeList = employees.stream()
                    .filter(employee -> EmployeeStatus.FREE.equals(employee.getEmployeeStatus()) && Profession.WASHER.equals(employee.getProfession()))
                    .collect(Collectors.toList());
            item = new Random().nextInt(employeeList.size());
            return employeeList.get(item);
        }

        employeeList = employees.stream()
                .filter(employee -> EmployeeStatus.FREE.equals(employee.getEmployeeStatus()) && Profession.REPAIR.equals(employee.getProfession()))
                .collect(Collectors.toList());
        item = new Random().nextInt(employeeList.size());
        return employeeList.get(item);
    }

    public void executeWork(Car car, Work work, Stuff stuff, String nameOfWork){
        List<Employee> employeeList = listOfStuff.getEmployeeList();
        Employee employee = getRandomEmployee(employeeList, nameOfWork);
        stuff.stuffMethod(employee);
        work.doYourWork(car);
    }

}
