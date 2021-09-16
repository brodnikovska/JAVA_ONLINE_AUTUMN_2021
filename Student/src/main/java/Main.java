import model.Age;
import model.Groups;
import model.ImmutableStudent;

public class Main {

    public static void main(String[] args) {
        ImmutableStudent immutableStudent = new ImmutableStudent("Danya", new Age(), Groups.FIRST_COURSE_MICROELECTRONICS);
        immutableStudent.setName("Petro");
        System.out.println(immutableStudent.getName());
    }
}
