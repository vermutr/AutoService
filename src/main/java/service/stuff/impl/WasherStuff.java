package service.stuff.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.stuff.Employee;
import service.stuff.Stuff;


@Data
@NoArgsConstructor
public class WasherStuff implements Stuff {

    /*
    может быть наследование по уровню квалификации
    */

    @Override
    public void stuffMethod(Employee employee) {
        //employees representation
        System.out.println("I am Washer Man and my name is " + employee.getName() + " " + employee.getSurname());
    }
}
