package service.stuff.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.stuff.Employee;
import service.stuff.Stuff;

@Data
@NoArgsConstructor
public class RepairStuff implements Stuff {

    /*
    может быть наследование по уровню квалификации
    */

    @Override
    public void stuffMethod(Employee employee) {
        //employees representation
        System.out.println("Hello, I'm good at fixing cars and my name is " + employee.getName() + " " + employee.getSurname());
    }
}
