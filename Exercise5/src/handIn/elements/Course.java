package handIn.elements;

import handIn.people.Student;

import java.util.HashSet;

public class Course {
    private String nameOfCourse;
    private int ECTS;
    private int HomeWorkHours; //Homework hours per week
    private HashSet<Student> attendentSet;

    public Course(String nameOfCourse, int ECTS, int homeWorkHours) {
        this.nameOfCourse = nameOfCourse;
        this.ECTS = ECTS;
        HomeWorkHours = homeWorkHours;
        this.attendentSet = new HashSet<>();
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public int getECTS() {
        return ECTS;
    }

    public int getHomeWorkHours() {
        return HomeWorkHours;
    }
}
