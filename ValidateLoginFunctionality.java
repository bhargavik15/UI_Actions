package ui_actions.com;
import org.testng.annotations.Test;

import java.io.IOException;

public class ValidateLoginFunctionality extends DriverInstanceBase {


    //in this class i call all the methods present in loginPage class


    @Test
     public void login_functionality () throws IOException {
            LoginPage login = new LoginPage(driver);

            login.enterUserName("Bhargavi Kallagunta");
            login.enterPassword("1234566");
            login.clickSignIn();



        }
    }





