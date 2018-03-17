package handIn;

import handIn.elements.Course;
import handIn.exceptions.IllegalUniversityException;
import handIn.people.Faculty;
import handIn.people.Staff;
import handIn.people.Student;

import java.util.HashSet;
import java.util.Set;

public class University {

    private String schoolName;
    private String location;

    private int maxCountStudent;
    private int maxCountFaculty;
    private int maxCountStaff;

    private int currentCountStudent;
    private int currentCountFaculty;
    private int currentCountStaff;

    private HashSet<Course> coursesSet;
    private HashSet<Student> studentSet;
    private HashSet<Faculty> facultySet;
    private HashSet<Staff> staffSet;


    public University(String schoolName, String location, int maxCountStudent, int maxCountFaculty, int maxCountStaff) {

        this.inputValidation(schoolName, location, maxCountStudent, maxCountFaculty, maxCountStaff);

        this.schoolName = schoolName;
        this.location = location;
        this.maxCountStudent = maxCountStudent;
        this.maxCountFaculty = maxCountFaculty;
        this.maxCountStaff = maxCountStaff;

        this.currentCountStudent = 0;
        this.currentCountFaculty = 0;
        this.currentCountStaff = 0;

        this.coursesSet = new HashSet<>();
        this.studentSet = new HashSet<>();
        this.facultySet = new HashSet<>();
        this.staffSet = new HashSet<>();
    }

    private void inputValidation(String schoolName, String location, int maxCountStudent, int maxCountFaculty, int maxCountStaff){

        if(schoolName.length() < 1) //School names should contain at least one char.
            throw new IllegalUniversityException("The name of the school need to contain at least one character");
        if(location.length() < 1) //Location should contain at least one char.
            throw new IllegalUniversityException("The location of the school need to contain at least one character");
        if(maxCountStudent < 0) //Should not contain negative count of people
            throw new IllegalUniversityException("The maximal number of students has to be 0 or higher");
        if(maxCountFaculty < 0) //Should not contain negative count of people
            throw new IllegalUniversityException("The maximal number of faculty has to be 0 or higher");
        if(maxCountStaff < 0) //Should not contain negative count of people
            throw new IllegalUniversityException("The maximal number of staff has to be 0 or higher");

    }

    public void signinPerson(Student person){
        if(currentCountStudent < maxCountStudent){
            this.studentSet.add(person);
            this.currentCountStudent++;
        }
    }

    public void signinPerson(Faculty person){
        if(currentCountFaculty < maxCountFaculty){
            this.facultySet.add(person);
            this.currentCountFaculty++;
        }
    }

    public void signinPerson(Staff person){
        if(currentCountStaff < maxCountStaff){
            this.staffSet.add(person);
            this.currentCountStaff++;
        }
    }

    public void addCourse(Course course){
        this.coursesSet.add(course);
    }




    public String getSchoolName() {
        return schoolName;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCountStudent() {
        return maxCountStudent;
    }

    public int getMaxCountFaculty() {
        return maxCountFaculty;
    }

    public int getMaxCountStaff() {
        return maxCountStaff;
    }

    public int getCurrentCountStudent() {
        return currentCountStudent;
    }

    public int getCurrentCountFaculty() {
        return currentCountFaculty;
    }

    public int getCurrentCountStaff() {
        return currentCountStaff;
    }

    public Set<Course> getCoursesSet() {
        return coursesSet;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public Set<Faculty> getFacultySet() {
        return facultySet;
    }

    public Set<Staff> getStaffSet() {
        return staffSet;
    }
}
