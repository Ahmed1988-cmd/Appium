package Tests;

import Pages.RegistrationPage;
import org.testng.annotations.Test;

public class UserRegistrationTC extends TestBase
{
    RegistrationPage loginObj;

    //First User
    String FirstName = "Ahmed";
    String LastNameText = "hafez";
    String PhoneNumber = "06924055";
    String Email = "ahmed@hotmail.com";
    String Password= "zaza123AA@";

    @Test(priority = 1, alwaysRun = true)
    public void UserCanRegister() throws InterruptedException
    {
        loginObj = new RegistrationPage(driver);
        loginObj.registration(FirstName,LastNameText,PhoneNumber,Email,Password);
    }


}
