package service.stuff.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.stuff.Employees;
import service.stuff.Stuff;


@Data
@NoArgsConstructor
public class WasherStuff implements Stuff {


    /*
    может быть наследование по уровню квалификации
    */

    @Override
    public void qualification(Employees employees) {
        //employees representation
        System.out.println("I am Washer Man");
    }
}
