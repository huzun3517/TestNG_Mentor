package MeryemHanim.ParalelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CoronaVirus extends BaseDriverYahoo {

    @Test
    public void CoronaVirus(){

        WebElement mailLink = driver.findElement(By.linkText("Coronavirus"));
        mailLink.click();
    }
}
