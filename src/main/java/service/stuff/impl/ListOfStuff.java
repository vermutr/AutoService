package service.stuff.impl;

import executeWork.stuff.Employee;
import executeWork.stuff.EmployeeStatus;
import executeWork.stuff.Profession;
import lombok.Data;
import lombok.NoArgsConstructor;
import service.stuff.Stuff;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ListOfStuff implements Stuff {
    private List<Employee> employeeList=new ArrayList<>();

    {
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

    @Override
    public void stuffMethod(Employee employee) {
        employeeList.add(employee);
    }

}
