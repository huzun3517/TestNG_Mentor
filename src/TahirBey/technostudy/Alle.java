package TahirBey.technostudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alle extends BaseDriver_technostudy {

    @Test(priority = 1)
    public void applyNow(){
        WebElement applynowLink = driver.findElement(By.linkText("Apply now"));
        applynowLink.click();
        String expect = "https://techno.study/apply-now/";
        String actual = driver.getCurrentUrl();
        System.out.println(expect);
        Assert.assertEquals(actual,expect,"The URL is incorrect");
    }

    @Test(priority = 2)
    public void contactUs(){
        WebElement contactUsLink = driver.findElement(By.linkText("Contact us"));
        contactUsLink.click();
        String expect = "https://techno.study/contact-us/";
        String actual = driver.getCurrentUrl();
        System.out.println(expect);
        Assert.assertEquals(actual,expect,"The URL is incorrect");
    }

    @Test(priority = 3)
    public void homePage(){
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();
        String expect = "https://techno.study/";
        String actual = driver.getCurrentUrl();
        System.out.println(expect);
        Assert.assertEquals(actual,expect,"The URL is incorrect");
    }
}
