package OmerBeyYoutube.Ders1;

import org.testng.annotations.*;

public class _02_TestNG2 {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method--------- -------------");
    }


    @Test
    public void test1(){
        System.out.println("Test--1");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("Sistem açılıyor...");
    }


    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method-----------------------");
    }


    @Test
    public void test2(){
        System.out.println("Test--2");
    }


    @AfterClass
    public void AfterClass(){
        System.out.println("Sistem kapanıyor...");
    }


    @Test
    public void test3(){
        System.out.println("Test--3");
    }
}