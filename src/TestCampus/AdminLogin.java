package TestCampus;

import GWD.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminLogin extends BaseDriver {

    @Test
    public void AdminLogin() {
        driver.get("https://test.mersys.io/");

        WebElement username = driver.findElement(By.id("mat-input-0"));
        username.sendKeys("turkeyts");

        WebElement Password = driver.findElement(By.id("mat-input-1"));
        Password.sendKeys("TechnoStudy123");

        WebElement Login = driver.findElement(By.cssSelector("button[aria-label='LOGIN']"));
        Login.click();


        BekleKapat();
    }

}
