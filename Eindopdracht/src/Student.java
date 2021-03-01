import java.util.ArrayList;
import java.util.Date;

public class Student extends User {

    private String nationality;
    private String profile;
    private Date dateOfBirth;
    private String Classroom;
    private ArrayList<Date> dateAbsent;
    private ArrayList<ArrayList<String>> grades;


    public Student(String name, Date dateOfBirth) {
        super(name, dateOfBirth);
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassroom() {
        return Classroom;
    }

    public void setClassroom(String classroom) {
        Classroom = classroom;
    }

    public ArrayList<Date> getDateAbsent() {
        return dateAbsent;
    }

    public void setDateAbsent(ArrayList<Date> dateAbsent) {
        this.dateAbsent = dateAbsent;
    }

    public ArrayList<ArrayList<String>> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<ArrayList<String>> grades) {
        this.grades = grades;
    }
}
