import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 3)
    void TestOne(){
        System.out.println("This is test1");
    }

    @Test(priority = 3,enabled = false)
    void TestTwo(){
        System.out.println("this is test2");
    }

    @Test(priority = 1)
    void TestThree(){
        System.out.println("This is test3");
    }


}
