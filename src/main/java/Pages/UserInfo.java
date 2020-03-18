package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class UserInfo extends PageBase
{
    public UserInfo(AppiumDriver<MobileElement> driver)
    {
        super(driver);
    }

     @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tv_add_driver")
     MobileElement AddDriver_Button;

     @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_driver_national_id")
     MobileElement DriverID_TXT;

     @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_month")
     MobileElement BirthMonth;
     @AndroidFindBy(xpath = "//android.widget.TextView")
     MobileElement Choose_Nov;

     @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_year")
    MobileElement BirthYear_DroDown;
    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tv_name")
    MobileElement choose_1991;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_education_qualification")
    MobileElement Education_DropDown;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Primary']")
    MobileElement choose_Primary;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_children_below_16")
    MobileElement Children_DorpDown;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='2']")
    MobileElement Choose_2;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/rb_50_percent")
    MobileElement choose_50;

   @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/switch_relationship")
   MobileElement RelationShip_SwichOn;
   @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tv_name")
   MobileElement Father;

   @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/switch_violation")
   MobileElement DriverViolations;


   @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/mb_continue")
   MobileElement Continue_Button;

    public void userInfo(String drivrid ) throws InterruptedException

    {
        ClickOn(AddDriver_Button);

        SetElement(DriverID_TXT,drivrid);

        Thread.sleep(2000);

        ClickOn(BirthMonth);

        Thread.sleep(2000);

        ClickOn(Choose_Nov);

        ClickOn(BirthYear_DroDown);

        Thread.sleep(2000);

        ClickOn(choose_1991);

        ClickOn(Education_DropDown);

        Thread.sleep(2000);

        ClickOn(choose_Primary);

        ClickOn(Children_DorpDown);

        ClickOn(Choose_2);

        ClickOn(choose_50);

        ClickOn(RelationShip_SwichOn);
        ClickOn(Father);

        ClickOn(DriverViolations);

        ClickOn(Continue_Button);
    }

}
