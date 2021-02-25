package service.stuff.impl;

import model.stuff.Employee;
import model.stuff.EmployeeStatus;
import model.stuff.Profession;
import lombok.Data;
import lombok.NoArgsConstructor;
import service.stuff.Stuff;
import java.util.ArrayList;
import java.util.List;

@Data
public class ListOfStuff implements Stuff {
    private final List<Employee> employeeList;

    public ListOfStuff(final List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void stuffMethod(Employee employee) {
        employeeList.add(employee);
    }

}
