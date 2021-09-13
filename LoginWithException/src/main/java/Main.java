import controller.Controller2;
import model.Model2;
import view.View2;

public class Main {

    public static void main(String[] args) {
        Controller2 controller =
                new Controller2(new Model2(), new View2());

        controller.processUser();
    }
}
