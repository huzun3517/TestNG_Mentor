package TahirBey.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testim {

    public WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser) {

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
            System.setProperty("webdriver.chrome.driver","C:/Users/Faruk_PC/Selenium/ChromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
            System.setProperty("webdriver.gecko.driver","C:/Users/Faruk_PC/Selenium/FirefoxDriver/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://learn-automation.com/");
    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }


    @Test
    public void title(){

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Selenium WebDriver tutorial Step by Step"));

        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title,"Automation - Selenium WebDriver tutorial Step by Step");

    }
}