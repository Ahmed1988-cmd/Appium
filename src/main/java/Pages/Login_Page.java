package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class Login_Page extends PageBase {

    public Login_Page(AppiumDriver driver) {
        super(driver);

    }

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/mb_login")
    MobileElement LogIn_Button;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_email")
    MobileElement Email_TXT;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tiet_password")
    MobileElement Password_TXT;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/mb_submit")
    MobileElement Login_Button2;

    @AndroidFindBy(id = "com.bawbty.bawbtyandroidtest:id/tv_get_a_quote")
    MobileElement GetAQouts_Button;


    public void Loginpage(String mail, String pass) throws InterruptedException {
        ClickOn(LogIn_Button);
        Thread.sleep(2000);
        SetElement(Email_TXT, mail);
        SetElement(Password_TXT, pass);
        Thread.sleep(2000);
        ClickOn(Login_Button2);
        Thread.sleep(2000);
        ClickOn(GetAQouts_Button);
        Thread.sleep(2000);

    }

}