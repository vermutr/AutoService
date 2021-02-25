import executeWork.sto.STO;
import model.car.Car;
import model.car.HatchBackCar;
import service.carService.impl.RepairCarImpl;
import service.carService.impl.WashCarImpl;
import service.stuff.impl.RepairStuff;
import service.stuff.impl.WasherStuff;

public class Main {
    public static void main(String[] args) {

        STO sto = new STO();
        Car car=new HatchBackCar(1,"Mercedes Benz","E290");
        RepairCarImpl repairCar=new RepairCarImpl();
        WashCarImpl washCar = new WashCarImpl();
        RepairStuff repairStuff = new RepairStuff();
        WasherStuff washerStuff = new WasherStuff();
        sto.executeWork(car, repairCar, repairStuff, "Wash");
        sto.executeWork(car, washCar, washerStuff, "Repair");

    }

}
