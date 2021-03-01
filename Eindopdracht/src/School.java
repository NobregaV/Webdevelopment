import java.util.ArrayList;

public class School {
private ArrayList<Teacher> listOfTeachers;
private ArrayList<Student> listOfStudent;
private String schoolType;
private ArrayList<String> curriculum;
private ArrayList<Classroom> listOfClasses;

    public ArrayList<Teacher> getListOfTeachers() {
        return listOfTeachers;
    }

    public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
        this.listOfTeachers = listOfTeachers;
    }

    public ArrayList<Student> getListOfStudent() {
        return listOfStudent;
    }

    public void setListOfStudent(ArrayList<Student> listOfStudent) {
        this.listOfStudent = listOfStudent;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public ArrayList<Classroom> getListOfClasses() {
        return listOfClasses;
    }

    public void setListOfClasses(ArrayList<Classroom> listOfClasses) {
        this.listOfClasses = listOfClasses;
    }

    public void addStudent(){

    }

    public void addTeacher(){

    }
}


