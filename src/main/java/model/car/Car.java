package model.car;


import lombok.Data;
import lombok.EqualsAndHashCode;
import model.DefaultModel;

@EqualsAndHashCode(callSuper = true)
@Data
public class Car extends DefaultModel {

    private String brand;
    private String model;

    public Car(final int id,
               final String brand,
               final String model) {
        super(id);
        this.brand = brand;
        this.model = model;
    }

    public void representCar(){
        System.out.println("unknown car");
    }
}
