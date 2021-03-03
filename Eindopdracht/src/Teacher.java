import java.util.ArrayList;
import java.util.Date;

public class Teacher extends User {

    private ArrayList<String> curriculum;
    private Classroom mentor;

    public Teacher(String name, Date dateOfBirth, ArrayList<String> curriculum) {
        super(name, dateOfBirth);

        this.curriculum = curriculum;
    }

    public Teacher(String name, Date dateOfBirth, ArrayList<String> curriculum, Classroom mentor) {
        super(name, dateOfBirth);
        this.curriculum = curriculum;
        this.mentor = mentor;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public Classroom getMentor() {
        return mentor;
    }

    public void setMentor(Classroom mentor) {
        this.mentor = mentor;
    }

    public static void main(String[] args) {
        Teacher teach1 = new Teacher("Urvin", new Date (07-06-1984), "Java");
        System.out.println(teach1);
    }
}
