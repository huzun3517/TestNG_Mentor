package OmerBey._02_DataProvider_SoftHard_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class facebookTest {


        WebDriver driver;

        @DataProvider
        public Object[][] myData() {

            // 3 kullanıcı denenecek içerisinde 2 adet bilhi olacak. email ve password
            Object[][] facebookData = new Object[3][2];

            facebookData[0][0] = "omer@gmail.com";
            facebookData[0][1] = "password1";

            facebookData[1][0] = "huseyin@gmail.com";
            facebookData[1][1] = "password2";

            facebookData[2][0] = "volkan@gmail.com";
            facebookData[2][1] = "password3";

            return facebookData;

        }






        @Test(dataProvider = "myData")
        public void Test1(String email, String password) throws InterruptedException {

            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

            System.setProperty("webdriver.chrome.driver","C:/Users/Faruk_PC/Selenium/ChromeDriver/chromedriver.exe");

            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://www.facebook.com/");

            String isim1 = "omer@gmail.com";
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("pass")).sendKeys(password);

            Thread.sleep(2000);

            driver.quit();
        }
}