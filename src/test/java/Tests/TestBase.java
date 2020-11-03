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
             cap.setCapability("deviceName","A20S");
         // cap.setCapability("udid","ce04171431d5a82c0c");
             cap.setCapability("platformName","Android");
             cap.setCapability("platformVersion","10");
             File file = new File ("C:\\Users\\ZaZa\\Desktop\\Alarabi-release.apk");
             cap.setCapability("app",file.getAbsolutePath());
           //  cap.setCapability("unicodeKeyboard",true);
            // cap.setCapability("resetKeyboard",true);

            // driver = new AndroidDriver(new URL("http://192.168.1.5.132:4723/wd/hub"),cap);
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);


             driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        }


    @AfterClass
    public void stopdriver()
    {
        driver.quit();
    }
}
