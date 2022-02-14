package ui_actions.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverInstanceBase {
    //Validate chrome browser

    public WebDriver driver;
    @BeforeMethod
    public void initiate() throws IOException {
       if(Utility.fetchPropertValue("browserName").toString().equalsIgnoreCase("chrome")) {
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
           driver=new ChromeDriver();
       } else {
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhargavi.kallagunta\\Downloads\\chromedriver_win32\\chromedriver.exe");
           driver=new ChromeDriver();

       }

        driver.get(Utility.fetchPropertValue("applicationUrl").toString());
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

   @AfterMethod
    public void closeDriverInstance(){
       driver.quit();

    }
}
