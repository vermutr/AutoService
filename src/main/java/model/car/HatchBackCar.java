package model.car;

public class HatchBackCar extends Car{

    public HatchBackCar(final int id,
                        final String brand,
                        final String model) {
        super(id, brand, model);
    }

    @Override
    public void representCar() {
        System.out.println("Hatch-Back Car");
        System.out.println(getBrand() + " " + getModel());

    }


}
