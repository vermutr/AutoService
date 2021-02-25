package model.car;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class HatchBackCar extends Car{

    public HatchBackCar(int id, String brand, String model) {
        super(id, brand, model);
    }

    @Override
    void representCar() {
        System.out.println("Hatch-Back Car");
    }


}
