package ui_actions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CompareAssertion {

    public static boolean validatePageUrl(WebDriver driver, String expUrl) throws IOException {
        driver.get(Utility.fetchPropertValue("applicationUrl").toString());
        expUrl = "https://www.facebook.com";

        boolean flag = false;
        if (driver.getCurrentUrl().equalsIgnoreCase(expUrl)) {
            flag = true;
        }
        return flag;
    }

    public static boolean validatePageTitle(WebDriver driver, String expTitle) throws IOException {
        driver.get(Utility.fetchPropertValue("applicationUrl").toString());
        expTitle = "Facebook – log in or sign up";

        boolean flag = false;
        if (driver.getTitle().equalsIgnoreCase(expTitle)) {
            flag = true;
        }
        return flag;


    }
}



