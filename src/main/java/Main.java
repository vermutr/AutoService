import executeWork.STO;
import model.car.Car;
import model.car.HatchBackCar;
import service.carService.impl.RepairCarImpl;
import service.carService.impl.WashCarImpl;

public class Main {
    public static void main(String[] args) {

        STO sto = new STO();
        Car car=new HatchBackCar(1,"Mercedes Benz","E290");
        RepairCarImpl repairCar=new RepairCarImpl();
        WashCarImpl washCar = new WashCarImpl();
        sto.getEmployeesList();
        sto.executeRepair(car,repairCar);
        sto.executeWash(car,washCar);

    }

}
