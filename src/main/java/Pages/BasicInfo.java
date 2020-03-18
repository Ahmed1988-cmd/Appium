package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BasicInfo extends PageBase
{
    public BasicInfo ( AppiumDriver driver)
    {
        super(driver);

    }

     @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_insured_national_id")
    MobileElement InsuredNationalid_TXT;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_sequence_number")
    MobileElement SequanceNumber_TXT;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_month")
    MobileElement BirthMonth_DropDown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rabi al-Thani']")
    MobileElement rabielThani;

     @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_year")
    MobileElement Birthday;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_policy_effective_date")
    MobileElement PolicyDatePaker;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='17 March 2020']")
    MobileElement select18;
    @AndroidFindBy(id = "android:id/button1")
    MobileElement ok_Button;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/cb_TermsAndConditions")
    MobileElement Tearms_Conditions;
    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/mb_continue")
    MobileElement Continue_Button;


    public void basicInfo(String nationalid , String Seq ) throws InterruptedException
    {
        SetElement(InsuredNationalid_TXT,nationalid);
        SetElement(SequanceNumber_TXT,Seq);
        ClickOn(BirthMonth_DropDown);
        Thread.sleep(2000);
        ClickOn(rabielThani);
        Thread.sleep(2000);
        Birthday.sendKeys("1379");
        Thread.sleep(2000);
        ClickOn(PolicyDatePaker);
        Thread.sleep(2000);
        ClickOn(select18);
        ClickOn(ok_Button);
        ClickOn(Tearms_Conditions);
        ClickOn(Continue_Button);


    }



}
