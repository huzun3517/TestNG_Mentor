package TahirBey.technostudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplyNow extends BaseDriver_technostudy {

    @Test
    public void applyNow(){
        WebElement applynowLink = driver.findElement(By.linkText("Apply now"));
        applynowLink.click();
        String expect = "https://techno.study/apply-now/";
        String actual = driver.getCurrentUrl();
        System.out.println(expect);
        Assert.assertEquals(actual,expect,"The URL is incorrect");
    }
}
