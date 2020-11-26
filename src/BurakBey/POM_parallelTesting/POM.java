package BurakBey.POM_parallelTesting;

import org.testng.annotations.Test;

public class POM extends BaseDriverPOM{

    @Test
    public void PageObjectModel(){

        pomSelenium pom = new pomSelenium(driver);

        pom.isim.sendKeys("Burak");
        pom.soyIsim.sendKeys("Türkmen");
        pom.mail.sendKeys("brk@brk.com");
        pom.alanKodu.sendKeys("+49");
        pom.telNo.sendKeys("12432354632");
        pom.hangisi.click();
        pom.adres1.sendKeys("Langberg Str.");
        pom.adres2.sendKeys("23");
        pom.sehir.sendKeys("Rodenbach");
        pom.eyalet.sendKeys("Hessen");
        pom.postaKodu.sendKeys("63517");
    }
}
