package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Select;

public class GetaQuote extends PageBase
{
    public GetaQuote(AppiumDriver<MobileElement> driver)
    {
        super(driver);
    }


    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_vehicle_value")
    MobileElement Vehicle_TXT;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_driving_city")
    MobileElement DrivingCity_DroDown;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='RIYADH']")
    MobileElement RIYADH;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/mb_get_quotes")
    MobileElement GetaQuotes_Button;


    public void GetaQuotes(String vehicle) throws InterruptedException
    {
        SetElement(Vehicle_TXT,vehicle);
        ClickOn(DrivingCity_DroDown);
        ClickOn(RIYADH);
        ClickOn(GetaQuotes_Button);
        Thread.sleep(3000);
    }

}
