package BurakBey.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseDriver {

    @Test
    public void Test_1() throws InterruptedException {
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();

        // Time tıklandı

        WebElement timeLink = driver.findElement(By.linkText("Time"));
        timeLink.click();

        WebElement timessheeltsLinl = driver.findElement(By.linkText("Timesheets"));
        timessheeltsLinl.click();

        WebElement employeeTimesheets = driver.findElement(By.linkText("Employee Timesheets"));
        employeeTimesheets.click();

        WebElement employeeName = driver.findElement(By.cssSelector("input#employee"));
        employeeName.click();

        String str = "Linda Anderson";
        employeeName.sendKeys(str);

        WebElement viewButton = driver.findElement(By.cssSelector("input#btnView"));
        WebDriverWait wait=new WebDriverWait(driver, 15);// sadece süre tanımlandı henüz aktif değil.
        wait.until(ExpectedConditions.elementToBeClickable(viewButton));

        viewButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div.message.warning"));
        Assert.assertTrue(successMessage.getText().contains("No Timesheets Found"));

    }
}