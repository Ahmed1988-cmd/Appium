package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase
{
     public Select select;


    public PageBase(AppiumDriver<MobileElement>driver)
     {

         PageFactory.initElements(new AppiumFieldDecorator(driver),this);

     }

     public void ClickOn(MobileElement element)
    {
        element.click();
    }

   public void SetElement(MobileElement element,String Value)
    {
        element.sendKeys(Value);
    }

    public void ScrollDown()
    {

    }

}


