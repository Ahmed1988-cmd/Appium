package Tests;

import Pages.BasicInfo;
import Pages.GetaQuote;
import Pages.Login_Page;
import Pages.UserInfo;
import org.testng.annotations.Test;

public class LogIn_TC extends TestBase
{
    Login_Page loginObj;
    String EmailLogin = "somaya.ibrahim@Devexy.com";
    String PasswordLogin = "Si@12345";

    BasicInfo basicObj;
    String nationalID = "1019621018";
    String Sequance = "757613110";

    UserInfo userObj;
    String DriverID = "2422523619";

    GetaQuote quoteObj;
    String quotes = "627389";


    @Test(priority = 1, alwaysRun = true)
    public void UserCanLoig() throws InterruptedException
    {

        loginObj = new Login_Page(driver);
        loginObj.Loginpage(EmailLogin, PasswordLogin);

    }

        @Test(priority = 2)
        public void BasicInfoPage() throws InterruptedException
    {
        basicObj = new BasicInfo(driver);
        basicObj.basicInfo(nationalID, Sequance);

    }

       @Test(priority = 3)
       public void UserInfo() throws InterruptedException
    {
       userObj = new UserInfo(driver);
       userObj.userInfo(DriverID);

    }

         @Test(priority = 4)
         public void UserGetaQuote() throws InterruptedException
    {
         quoteObj = new GetaQuote(driver);
         quoteObj.GetaQuotes(quotes);
    }


}
