package GWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {



 public static void DriverStart()
 {
     WebDriver driver = new ChromeDriver();
 }



 public static void WaitClose()
 {


     MyFunc.Wait(3);
     driver.quit;
 }


}
