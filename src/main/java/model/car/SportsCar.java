package model.car;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class SportsCar extends Car{

    @Override
    void representCar() {
        System.out.println("Sport Car");;
    }
}
