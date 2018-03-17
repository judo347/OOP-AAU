package handIn;

import handIn.elements.Course;
import handIn.people.Admin;
import handIn.people.IT;
import handIn.people.Professor;
import handIn.people.Student;

public class Simulator {

    public static void main(String[] args) {

        University uni = new University("Svendborg Tech-Uni", "Svendborg", 200, 20, 20);
        fillBaseForUni(uni);

        //Sign students to courses


        //TODO: Simulate a year! Couces completed, gradings and +1 age

    }

    public static void fillBaseForUni(University uni){

        //Create students
        Student student01 = new Student("Mikkel", "Kuntz", 23, 940415);
        Student student02 = new Student("Amanda", "Niess", 22, 950512);
        Student student03 = new Student("SpacePrincess", "Lumpy", 999, 121212);

        //Create faculty
        Professor prof01 = new Professor("Magnus", "TheCoolGuy", 28, 121212);
        Professor prof02 = new Professor("Kurt", "GUD", 99, 999999);

        //Create staff
        Admin admin01 = new Admin("Diana", "something", 35, 121212);
        IT it01 = new IT("BMO", "BOT", 129, 111111);

        //Sign people into uni
        uni.signinPerson(student01);
        uni.signinPerson(student02);
        uni.signinPerson(student03);
        uni.signinPerson(prof01);
        uni.signinPerson(prof02);
        uni.signinPerson(admin01);
        uni.signinPerson(it01);

        //Create a few courses
        Course course00  = new Course("PV", 5, 2);
        Course course01  = new Course("OOP", 5, 2);
        Course course02  = new Course("IMPR", 5, 2);
        Course course03  = new Course("DM", 5, 2);
        Course course04  = new Course("SLIAL", 5, 2);
        Course course05  = new Course("Cicada 3301", 99, 5);

        //Add cources to uni
        uni.addCourse(course00);
        uni.addCourse(course01);
        uni.addCourse(course02);
        uni.addCourse(course03);
        uni.addCourse(course04);
        uni.addCourse(course05);
    }
}
