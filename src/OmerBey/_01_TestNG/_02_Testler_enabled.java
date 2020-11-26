package OmerBey._01_TestNG;

import org.testng.annotations.*;

public class _02_Testler_enabled {


//todo  Testi görmezden gelmek için @Test in yanına --> '(enabled = false)' <--  fonksiyonunu kullanırız.


    @Test
    public void Test1(){
        System.out.println("TEST 1 ----------------");
    }


    @Test
    public void Test2(){
        System.out.println("TEST 2 ----------------");
    }


    @Test(enabled = false)
    public void Test3(){
        System.out.println("TEST 3 ----------------");
    }


    @Test(enabled = false)
    public void Test4(){
        System.out.println("TEST 4 ----------------");
    }


    @Test(enabled = false)
    public void Test5(){
        System.out.println("TEST 5 ----------------");
    }


    @Test
    public void Test6(){
        System.out.println("TEST 6 ----------------");
    }
}
