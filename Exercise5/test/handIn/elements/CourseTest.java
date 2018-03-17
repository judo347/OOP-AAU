package handIn.elements;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CourseTest {

    @Test
    public void courseCreating01(){
        Course course01 = new Course("Gain lvl 2 in POWERshell", 5,2);
    }
}
