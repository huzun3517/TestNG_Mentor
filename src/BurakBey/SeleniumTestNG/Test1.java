package BurakBey.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseDriver {

    @Test
    public void Test_1() {
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();

        // Directory tıklandı
        WebElement directory = driver.findElement(By.xpath("//b[contains(text(),'Directory')]"));
        directory.click();

        String str = "Smith kanth";

        // Name Input bölümü
        WebElement nameInput = driver.findElement(By.cssSelector("input.formInputText.ac_input"));
        nameInput.sendKeys(str);

        WebElement searchButton = driver.findElement(By.cssSelector("input#searchBtn"));
        searchButton.click();

        WebElement SuccessMessage = driver.findElement(By.cssSelector("tr.odd>td+td>ul>li>b"));
        Assert.assertTrue(SuccessMessage.getText().contains(str));
    }
}
