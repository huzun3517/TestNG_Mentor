package OmerBey._01_TestNG;

import org.testng.annotations.Test;

public class _03_Testler_priority {

// todo    TestNG testlerinde, tesler konsola alfabetik sıra ile yazdırılır


    @Test(priority = 202)
    public void b(){
        System.out.println("b");
    }


    @Test(priority = 201,enabled = false) // a yı sıralamaya koyduk önce ama sonra görmezden geldiğimiz için gözükmez.
    public void a(){
        System.out.println("a");
    }


    @Test(priority = 200)
    public void c(){
        System.out.println("c");
    }
}