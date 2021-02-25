package service.sto;

import model.car.Car;
import model.stuff.Employee;
import model.stuff.EmployeeStatus;
import model.stuff.Profession;
import service.carService.Work;
import service.stuff.Stuff;
import service.stuff.impl.RegisterNewStuff;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Sto {

    private final RegisterNewStuff registerNewStuff;

    public Sto(final RegisterNewStuff registerNewStuff) {
        this.registerNewStuff = registerNewStuff;
    }


    public Employee getRandomEmployee(final List<Employee> employees, final String nameOfWork){
        final int item;
        final List<Employee> employeeList;
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

    public void executeWork(final Car car, final Work work, final Stuff stuff, final String nameOfWork){
        final List<Employee> employeeList = registerNewStuff.getEmployeeList();
        Employee employee = getRandomEmployee(employeeList, nameOfWork);
        stuff.stuffMethod(employee);
        work.doYourWork(car);
    }

}
