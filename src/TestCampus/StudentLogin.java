package TestCampus;

import GWD.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StudentLogin extends BaseDriver {
    @Test
    public void StudentLogin()
    {
        driver.get("https://test.mersys.io/");

        WebElement username = driver.findElement(By.id("mat-input-0"));
        username.sendKeys("S5_11C");

        WebElement Password = driver.findElement(By.id("mat-input-1"));
        Password.sendKeys("12345");

        WebElement Login = driver.findElement(By.linkText(" GİRİŞ YAP "));
        Login.click();



        BekleKapat();
    }
}
