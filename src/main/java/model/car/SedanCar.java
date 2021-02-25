package model.car;

public class SedanCar extends Car{


    public SedanCar(final int id,
                    final String brand,
                    final String model) {
        super(id, brand, model);
    }

    @Override
    public void representCar(){
        System.out.println("Sedan car");
        System.out.println(getBrand() + " " + getModel());

    }

}
