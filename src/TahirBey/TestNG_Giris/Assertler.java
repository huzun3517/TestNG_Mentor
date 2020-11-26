package TahirBey.TestNG_Giris;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertler {

    @Test
    public void test1() {
        System.out.println("Test 1 başladı...");
        Assert.assertEquals("tahir","tahir","Test geçmedi, kontrol et"); //soldaki aslında olan- sağdaki beklenen
        System.out.println("Test 1 bitti");
    }


    @Test
    public void test2() {
        System.out.println("Test 2 başladı...");
        Assert.assertEquals(2,3,"Test geçmedi, kontrol et"); //soldaki aslında olan- sağdaki beklenen
        // programdan 2 geliyor ama biz 3 bekliyoruz...
        System.out.println("Test 2 bitti");
    }

    @Test
    public void test3() {
        String str= "Java";
        Assert.assertTrue(str.contains("v"));
    }

    @Test
    public void test4() {
        String str= "Java";
        Assert.assertFalse(str.contains("V"));
    }
}
