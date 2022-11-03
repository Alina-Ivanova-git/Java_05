import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    /* Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     *Expected result: 1
     */

    @Test
    /* if (a == b)
     */
    public void areNumbersEqualTest_Equal (){
        int a = 89;
        int b = 89;
        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    /* if (a < b)
     */
    public void areNumbersEqualTest_bGreaterThana (){
        int a = -89;
        int b = 89;
        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    /* if (a > b)
     */
    public void areNumbersEqualTest_aGreaterThanb (){
        int a = 89;
        int b = -89;
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
