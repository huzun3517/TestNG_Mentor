package TahirBey.TestNG_Giris;

import org.testng.annotations.*;

public class Annotationlar {

    @BeforeSuite
    public void setUp() {
        System.out.println("BeforeSuite--Chrome set up");
    }

    @BeforeTest
    public void launchBrowser() {
        System.out.println("BeforeTest--Launch browser");
    }

    @BeforeClass
    public void login() {
        System.out.println("BeforeClass--login to website");
    }

    @BeforeMethod
    public void enterURL() {
        System.out.println("BeforeMethod--Enter URL");
    }

    @Test
    public void getTitle() {
        System.out.println("Test Case 1--website Title test");
    }

    @Test
    public void searcTest() {
        System.out.println("Test Case 2--search test");
    }

    @AfterMethod
    public void logOut() {
        System.out.println("AfterMethod--Log out from website");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("AfterClass--close website");
    }

    @AfterTest
    public void deleteAllCookies() {
        System.out.println("AfterTest--Delete all cookies");
    }

    @AfterSuite
    public void generateReport() {
        System.out.println("AfterSuite--generate report");
    }
}
