import config.ApiConfiguration;
import model.car.Car;
import service.action.impl.Notification;
import service.carService.Work;
import service.sto.Sto;
import service.stuff.Stuff;
import service.stuff.impl.ListOfStuff;

public class Main {
    public static void main(String[] args) {

        final ApiConfiguration apiConfiguration = new ApiConfiguration();
        final ListOfStuff listOfStuff = apiConfiguration.listOfStuff();
        final Notification notification = apiConfiguration.notification();
        final Sto sto = apiConfiguration.sto(listOfStuff);
        final Stuff stuff = apiConfiguration.stuff();
        final Work work = apiConfiguration.work(notification);
        final Car car = apiConfiguration.car();
        sto.executeWork(car, work, stuff, "Repair");
    }

}
