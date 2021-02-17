package service.stuff.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.Employees;
import service.stuff.Stuff;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class WasherStuff implements Stuff {

    @Override
    public void qualification(Employees employees) {
        //employees representation
        System.out.println("I am Washer Man");
    }
}
