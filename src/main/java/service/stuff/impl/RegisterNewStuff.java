package service.stuff.impl;

import lombok.Data;
import model.stuff.Employee;
import service.stuff.Stuff;

import java.util.List;

@Data
public class RegisterNewStuff implements Stuff {
    private final List<Employee> employeeList;

    public RegisterNewStuff(final List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void stuffMethod(Employee employee) {
        employeeList.add(employee);
    }

}
