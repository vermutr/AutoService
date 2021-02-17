import service.action.Action;
import service.action.impl.DoWashImpl;

public class Main {
    public static void main(String[] args) {

        Action action=new DoWashImpl();
        action.doSomething();
    }
}
