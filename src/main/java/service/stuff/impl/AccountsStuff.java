package service.stuff.impl;

import lombok.Data;
import lombok.NoArgsConstructor;
import executeWork.stuff.Employee;
import service.stuff.Stuff;

@Data
@NoArgsConstructor
public class AccountsStuff implements Stuff {


    /*
     может быть наследование по уровню квалификации (главный бухшалтер, бухгалтер и т.д. также и с другими стафами)
     */

    @Override
    public void qualification(Employee employee) {
        //employees representation
        System.out.println("I am accountant");
    }
}
