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
public class RepairStuff implements Stuff {


    @Override
    public void qualification(Employees employees) {
        //employees representation
        System.out.println("Hello, I'm good at fixing cars");
    }
}
