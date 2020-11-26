package OmerBey._02_DataProvider_SoftHard_Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider1_b {

    @DataProvider(name = "myData")
    public Object[] dataProviderMethod() {

        Object[]a = {"data1","data2","data3"};

        return a;
    }

    @Test(dataProvider = "myData")
    public void TestMethod2(String data) {

        System.out.println("Data: " + data);
    }
}
