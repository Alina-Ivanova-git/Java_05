import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test

    public void bBiggerThanaTest () {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void aBiggerThanbTest () {
        int a = 12;
        int b = 7;
        int expectedResult = 12;
        int actualResult = new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void bEqualsaTest () {
        int a = 7;
        int b = 7;
        int expectedResult = 7;
        int actualResult = new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
