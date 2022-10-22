import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class SumArrayTest {
    /* Test Data:
{0, 1, 2, 3, 4, 5} → 15
{-7, -3} → -10
     */
    @Test
    public void testSumArrayHappy_Path(){
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayHappy_Path1(){
        int [] array = new int []{-7, -3};
        int expectedResult = -10;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEmptyArray(){
        int [] array = new int []{};
        int expectedResult = 0;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }






}
