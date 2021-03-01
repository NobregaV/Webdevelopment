import java.util.ArrayList;
import java.util.Date;

public class Teacher extends User {
    private ArrayList<String> curriculum;

    public Teacher(String name, Date dateOfBirth) {
        super(name, dateOfBirth);
    }
}
