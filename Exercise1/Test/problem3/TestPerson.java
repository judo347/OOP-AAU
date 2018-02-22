package problem3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.Assert;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestPerson {

    Person person = null;

    @BeforeAll
    public void beforeAll(){
        person = new Person("testName", 180, 80);
    }

    @Test
    public void getName01(){
        Assert.assertEquals("testName", person.getName());
    }

    @Test
    public void getHeight01(){
        Assert.assertEquals(180, person.getHeight());
    }

    @Test
    public void getWeight01(){
        Assert.assertEquals(80, person.getWeight());
    }

    @Test
    public void getBMI(){
        Person personTest = new Person("testName", 180, 80);
        System.out.println(personTest.getBodyMassIndex());
        Assert.assertEquals(24.7, personTest.getBodyMassIndex());
    }

}
