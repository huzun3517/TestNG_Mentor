package OmerBey._02_DataProvider_SoftHard_Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider2 {

    @DataProvider()
    public Object[][] getData() {

        Object[][] data = new Object[3][2];

        //Ömer Kullanıcı bilgileri
        data[0][0] = "omeroz12";
        data[0][1] = "password1";

        //Çiğdem Kullanıcı bilgileri
        data[1][0] = "cigdem12";
        data[1][1] = "password2";

        //Hüseyin Kullanıcı bilgileri
        data[2][0] = "huseyin12";
        data[2][1] = "password3";

        return data;
    }

    @Test(dataProvider = "getData")
    public void Test(String username, String password) {

        System.out.println(username + " " + password);
    }
}
