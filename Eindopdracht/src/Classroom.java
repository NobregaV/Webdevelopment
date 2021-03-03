import java.util.ArrayList;

public class Classroom {
    private String name;
    private Teacher mentor;
   private ArrayList<Student> listOfStudents;

    public Classroom(String name, Teacher mentor, ArrayList<Student> listOfStudents) {
        this.name = name;
        this.mentor = mentor;
        this.listOfStudents = listOfStudents;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getMentor() {
        return mentor;
    }

    public void setMentor(Teacher mentor) {
        this.mentor = mentor;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }


}
