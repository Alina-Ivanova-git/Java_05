import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
/* Test Data:
 * -345 →  “Odd”
 * 0 →  “Even”
 * 222222 →  “Even”
 */
    /* Positive test
     * if a = -345
     * -345 →  “Odd”
     */
    @Test
    public void testOddNumber(){
        int a = -345;
        String expectedResult = "Odd";
        String actualResult = new OddEven().oddEven(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Positive test
     * if a = 0
     * 0 →  “Even”
     */
    @Test

    public void testEvenNumber(){
        int a = 0;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Positive test
     * if a = 222222
     * 222222 →  “Even"
     */

    @Test
    public void testEvenNumberTwo (){
        int a = 222222;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(a);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
