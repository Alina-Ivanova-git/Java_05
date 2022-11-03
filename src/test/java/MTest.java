import org.testng.Assert;
import org.testng.annotations.Test;

public class MTest {

    @Test
    /* if ((m % 7 == 0) && (m % 9 == 0))
     */
    public void mTest_MultipleSevenAndNine(){
        int m = 63;
        String expectedResult = "Good Number";
        String actualResult = new M().m(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    /* else if ((m % 9 == 0) && (m % 7 != 0))
     */
    public void mTest_MultipleNine (){
        int m = 81;
        String expectedResult = "Bad Number";
        String actualResult = new M().m(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    /* else if (m % 11 == 0)
     */
    public void mTest_MultipleEleven (){
        int m = 88;
        String expectedResult = "Poor Number";
        String actualResult = new M().m(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void mTest_NumberIsNotMultiple (){
        int m = 8;
        String expectedResult = "-1";
        String actualResult = new M().m(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void mTestZero(){
        int m = 0;
        String expectedResult = "Zero is muliple of all numbers";
        String actualResult = new M().m(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
