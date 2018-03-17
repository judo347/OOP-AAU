package handIn;

import handIn.exceptions.IllegalUniversityException;
import handIn.people.Admin;
import handIn.people.Professor;
import handIn.people.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//TODO: limit unit

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UniversityTest {

    String defSchoolName = "Svendborg Universitet";
    String defLocation = "Svendborg";
    int defMaxCountStudent = 200;
    int defMaxCountFaculty = 20;
    int defMaxCountStaff = 20;

    @Test
    public void creationTest01(){
        University uni = new University(defSchoolName, defLocation, defMaxCountStudent, defMaxCountFaculty, defMaxCountStaff);

        Assertions.assertEquals(defSchoolName, uni.getSchoolName());
        Assertions.assertEquals(defLocation, uni.getLocation());
        Assertions.assertEquals(defMaxCountStudent, uni.getMaxCountStudent());
        Assertions.assertEquals(defMaxCountFaculty, uni.getMaxCountFaculty());
        Assertions.assertEquals(defMaxCountStaff, uni.getMaxCountStaff());

        Assertions.assertEquals(0,uni.getCurrentCountStudent());
        Assertions.assertEquals(0,uni.getCurrentCountFaculty());
        Assertions.assertEquals(0,uni.getCurrentCountStaff());
    }

    @Test
    public void creationTest02(){
        try{
            University uni = new University("", defLocation, defMaxCountStudent, defMaxCountFaculty, defMaxCountStaff);
        } catch (IllegalUniversityException e){
            Assertions.assertEquals("The name of the school need to contain at least one character", e.getErrorMsg());
        }

        try{
            University uni = new University(defSchoolName, "", defMaxCountStudent, defMaxCountFaculty, defMaxCountStaff);
        } catch (IllegalUniversityException e){
            Assertions.assertEquals("The location of the school need to contain at least one character", e.getErrorMsg());
        }

        try{
            University uni = new University(defSchoolName, defLocation, -5, defMaxCountFaculty, defMaxCountStaff);
        } catch (IllegalUniversityException e){
            Assertions.assertEquals("The maximal number of students has to be 0 or higher", e.getErrorMsg());
        }

        try{
            University uni = new University(defSchoolName, defLocation, defMaxCountStudent, -5, defMaxCountStaff);
        } catch (IllegalUniversityException e){
            Assertions.assertEquals("The maximal number of faculty has to be 0 or higher", e.getErrorMsg());
        }

        try{
            University uni = new University(defSchoolName, defLocation, defMaxCountStudent, defMaxCountFaculty, -5);
        } catch (IllegalUniversityException e){
            Assertions.assertEquals("The maximal number of staff has to be 0 or higher", e.getErrorMsg());
        }

    }

    @Test
    public void signinStudent01(){
        University uni = new University(defSchoolName, defLocation, defMaxCountStudent, defMaxCountFaculty, defMaxCountStaff);

        Student student01 = new Student("Mikkel", "Kuntz", 23, 940415);
        Professor prof01 = new Professor("Magnus", "TheCoolGuy", 28, 121212);
        Admin admin01 = new Admin("Diana", "something", 35, 121212);

        uni.signinPerson(student01);
        uni.signinPerson(prof01);
        uni.signinPerson(admin01);

        Assertions.assertEquals(1, uni.getCurrentCountStudent());
        Assertions.assertEquals(1, uni.getCurrentCountFaculty());
        Assertions.assertEquals(1, uni.getCurrentCountStaff());
    }

}
