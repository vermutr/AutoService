package model.car;


import model.DefaultModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
