package model.car;


public class SportsCar extends Car{

    public SportsCar(final int id,
                    final String brand,
                    final String model) {
        super(id, brand, model);
    }
    @Override
    public void representCar() {
        System.out.println("Sport Car");
        System.out.println(getBrand() + " " + getModel());
    }
}
