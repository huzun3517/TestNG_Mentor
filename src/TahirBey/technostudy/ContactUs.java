package TahirBey.technostudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs extends BaseDriver_technostudy {

    @Test
    public void contactUs(){
        WebElement contactUsLink = driver.findElement(By.linkText("Contact us"));
        contactUsLink.click();
        String expect = "https://techno.study/contact-us/";
        String actual = driver.getCurrentUrl();
        System.out.println(expect);
        Assert.assertEquals(actual,expect,"The URL is incorrect");
    }
}
