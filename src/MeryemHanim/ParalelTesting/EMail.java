package MeryemHanim.ParalelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EMail extends BaseDriverYahoo {

    @Test
    public void EMail(){

        WebElement mailLink = driver.findElement(By.linkText("Mail"));
        mailLink.click();
    }
}
