package model.car;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class SedanCar extends Car{

    @Override
    void representCar(){
        System.out.println("Sedan car");
    }

}
