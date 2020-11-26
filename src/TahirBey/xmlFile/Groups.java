package TahirBey.xmlFile;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "Regression")
    public void test1(){
        System.out.println("Test 1 is working");
    }

    @Test(groups = "Smoke")
    public void test2(){
        System.out.println("Test 2 is working");
    }

    @Test(groups = "Regression")
    public void test3(){
        System.out.println("Test 3 is working");
    }

    @Test(groups = "Smoke")
    public void test4(){
        System.out.println("Test 4 is working");
    }

    @Test(groups = "Regression")
    public void test5(){
        System.out.println("Test 5 is working");
    }

    @Test(groups = "Smoke")
    public void test6(){
        System.out.println("Test 6 is working");
    }

    @Test(groups = "Regression")
    public void test7(){
        System.out.println("Test 7 is working");
    }

    @Test(groups = "Smoke")
    public void test8(){
        System.out.println("Test 8 is working");
    }

    @Test
    public void test9(){
        System.out.println("Test 9 is working");
    }
}
