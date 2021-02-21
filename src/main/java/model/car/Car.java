package model.car;

import lombok.*;
import model.DefaultModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car extends DefaultModel {

    private String brand;
    private String model;

    public Car(int id, String brand, String model) {
        super(id);
        this.brand = brand;
        this.model = model;
    }

    void representCar(){
        System.out.println("unknown car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
