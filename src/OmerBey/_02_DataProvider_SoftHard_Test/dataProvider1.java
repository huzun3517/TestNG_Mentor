package OmerBey._02_DataProvider_SoftHard_Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider1 {

    @DataProvider
    public Object[][] dataProviderMethod() {

        Object[][]a = new Object[2][1];

        a[0][0] = "data 1";
        a[1][0] = "data 1";

        return a;
    }

    @Test(dataProvider = "dataProviderMethod")
    public void TestMethod(String data) {

        System.out.println("Data: " + data);
    }
}
