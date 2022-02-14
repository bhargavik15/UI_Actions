package ui_actions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage extends DriverInstanceBase  {

    //here I validate login for Facebook

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;

    }
    public void enterUserName(String uname) throws IOException{
        driver.findElement(By.id(Utility.fetchLocatorsValue("login_username_id"))).sendKeys(uname);
    }
    public void enterPassword(String pass) throws IOException {
        driver.findElement(By.id(Utility.fetchLocatorsValue("login_password_id"))).sendKeys(pass);
    }
    public void clickSignIn() throws IOException {
        driver.findElement(By.xpath(Utility.fetchLocatorsValue("login_sign_xpath"))).click();

    }


}
