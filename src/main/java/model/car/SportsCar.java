package model.car;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class SportsCar extends Car{

    @Override
    void representCar() {
        System.out.println("Sport Car");;
    }
}
