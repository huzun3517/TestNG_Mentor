package TahirBey.technostudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseDriver_technostudy {

    @Test
    public void homePage(){
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();
        String expect = "https://techno.study/";
        String actual = driver.getCurrentUrl();
        System.out.println(expect);
        Assert.assertEquals(actual,expect,"The URL is incorrect");
    }
}
