package model.car;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class SedanCar extends Car{

    @Override
    void representCar(){
        System.out.println("Sedan car");
    }

}
