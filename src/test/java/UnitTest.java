import model.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class UnitTest {
    Project project;
    Project project2;
    @BeforeEach
    void setup(){
        project = new Project();
        project2 = new Project("Zarria","DEV","React-to-do-app");
    }

    @Test
    public void test(){
        //Assumption is a junit class of methods to determine if a test
        // should be skipped depending on some condition
        //assuming true
        System.setProperty("ENV","DEV"); // System.setProperty is setting a key,value pair
        assumeTrue(project2.getStages().equals(System.getProperty("ENV")));
        System.out.println("2 is less than three");

        //assuming false
    }

}
