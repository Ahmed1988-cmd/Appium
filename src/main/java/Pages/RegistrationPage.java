package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class RegistrationPage extends PageBase
{

    public RegistrationPage(AppiumDriver driver)

    {
        super(driver);

    }

    @AndroidFindBy(id = "com.kw.alarabiclub:id/dialogSuccessfullyCloseIV")
    MobileElement CloseDialogButton;
    @AndroidFindBy(className = "android.widget.ImageButton")
    MobileElement OpenMenuButton;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='SignIn / SignUp']")
    MobileElement SignInButton;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/loginFragmentCreateAccountTV")
    MobileElement CreatAcountButton;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentOneFNameET")
    MobileElement FirstnameText;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentOneLNameET")
    MobileElement LastNameText;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentOneMobileET")
    MobileElement MobileNumberText;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentOneEmailET")
    MobileElement EmailText;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentOnePasswordET")
    MobileElement PasswordText;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentOneTermsCB")
    MobileElement AcepptButton;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentOneNextBTN")
    MobileElement NextButton;

     //SecoundPage
     @AndroidFindBy(id = "com.kw.alarabiclub:id/itemRegistrationChampionSelectionIV")
     MobileElement LeageButton;
   // @AndroidFindBy(id = "com.kw.alarabiclub:id/itemRegistrationChampionSelectionIV")
    //MobileElement MatchLineupButton;
    @AndroidFindBy(id = "com.kw.alarabiclub:id/registrationFragmentTwoSignUpBTN")
    MobileElement SignUpButton;





    public void registration(String firstname,String lastnameText,String PhoneNumber,String email,String Password) throws InterruptedException
    {
        Thread.sleep(500);
        ClickOn(CloseDialogButton);
        Thread.sleep(500);
       ClickOn(OpenMenuButton);
        Thread.sleep(500);
        ClickOn(SignInButton);
        Thread.sleep(500);
        ClickOn(CreatAcountButton);
        Thread.sleep(500);
        SetElement(FirstnameText,firstname);
        Thread.sleep(500);
        SetElement(LastNameText,lastnameText);
        Thread.sleep(500);
        SetElement(MobileNumberText,PhoneNumber);
        Thread.sleep(500);
        SetElement(EmailText,email);
        Thread.sleep(500);
        SetElement(PasswordText,Password);
        Thread.sleep(500);
        ClickOn(AcepptButton);
        Thread.sleep(500);
        ClickOn(NextButton);
        Thread.sleep(500);


        ClickOn(LeageButton);
        Thread.sleep(500);
      //  ClickOn(MatchLineupButton);
       // MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SIGN UP\")");
        ClickOn(SignUpButton);
        Thread.sleep(2500);


    }

}