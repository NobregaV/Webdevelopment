import java.util.ArrayList;
import java.util.Date;

public class Student extends User {

    private String nationality;
    private Classroom Classroom;
    private ArrayList<ArrayList<String>> grades;
    private String profile;
    private ArrayList<Date> dateAbsent;

    public Student(String name, Date dateOfBirth, String nationality) {
        super(name, dateOfBirth);
        this.nationality = nationality;
    }

    public Student(String name, Date dateOfBirth, String nationality, String profile) {
        super(name, dateOfBirth);
        this.nationality = nationality;
        this.profile = profile;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Classroom getClassroom() {
        return Classroom;
    }

    public void setClassroom(Classroom classroom) {
        Classroom = classroom;
    }

    public ArrayList<ArrayList<String>> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<ArrayList<String>> grades) {
        this.grades = grades;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public ArrayList<Date> getDateAbsent() {
        return dateAbsent;
    }

    public void setDateAbsent(ArrayList<Date> dateAbsent) {
        this.dateAbsent = dateAbsent;
    }


}

