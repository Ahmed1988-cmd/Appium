package Tests;


 import io.appium.java_client.android.AndroidDriver;
 import org.openqa.selenium.remote.DesiredCapabilities;
 import org.testng.annotations.AfterClass;
 import org.testng.annotations.BeforeSuite;


 import java.io.File;
 import java.net.MalformedURLException;
 import java.net.URL;
 import java.util.concurrent.TimeUnit;

public class TestBase

{
    public static AndroidDriver driver;

       @BeforeSuite
      public  void openMobile() throws MalformedURLException

     {
             DesiredCapabilities cap = new DesiredCapabilities();
             cap.setCapability("deviceName","Galaxy S8+");
         // cap.setCapability("udid","ce04171431d5a82c0c");
             cap.setCapability("platformName","Android");
             cap.setCapability("platformVersion","8.0.0");
             File file = new File ("C:\\Users\\ahmed.hafez\\Desktop\\bawbty-1.83-staging.apk");
             cap.setCapability("app",file.getAbsolutePath());
           //  cap.setCapability("unicodeKeyboard",true);
            // cap.setCapability("resetKeyboard",true);

             driver = new AndroidDriver(new URL("http://172.16.8.61.132:4723/wd/hub"),cap);


             driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        }


    @AfterClass
    public void stopdriver()
    {
        driver.quit();
    }
}
