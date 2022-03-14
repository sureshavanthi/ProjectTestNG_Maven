import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("drive the car");
    }

    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)
    void startCar(){
        System.out.println("start the car");
    }

    @Test
    void parkCar() {
        System.out.println("park the car");
        Assert.fail();
    }


    }

