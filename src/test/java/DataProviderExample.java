import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider  = "LoginDataProvider")
    public void loginTest(String email, String pwd) {
        System.out.println("email is " + email);
        System.out.println("password is " + pwd);
    }


    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}};
        return data;
    }
}










