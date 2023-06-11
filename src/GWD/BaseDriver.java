package GWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;


 public static void DriverStart()
 {
     System.out.println(" System is starting " );
     Logger logger=Logger.getLogger("");
     logger.setLevel(Level.SEVERE);
     System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(options);

     Duration dr=Duration.ofSeconds(30);
     driver.manage().timeouts().pageLoadTimeout(dr);
     driver.manage().timeouts().implicitlyWait(dr);

 }



 public static void WaitClose()
 {

     System.out.println(" System is Closing " );
     MyFunc.Wait(3);
     driver.quit();
 }


}
