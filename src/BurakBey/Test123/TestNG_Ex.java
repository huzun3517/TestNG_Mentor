package BurakBey.Test123;
import org.testng.annotations.Test;

public class TestNG_Ex {

    @Test
    public void telefonu_acmak(){
        System.out.println("Telefonu açıyorum");
    }


    @Test(dependsOnMethods = {"telefonu_acmak"})
    public void birini_aramak(){
        System.out.println("Rehberden birini arıyorum");
    }


    @Test(dependsOnMethods = {"birini_aramak"})
    public void gorusmek(){
        System.out.println("Aradığım kişiyle görüşüyorum");
//        Assert.fail();
    }


    @Test(dependsOnMethods = {"gorusmek"})
    public void gorusmeyi_bitirmek(){
        System.out.println("Görüşmeyi bitiriyorum");
    }
}
