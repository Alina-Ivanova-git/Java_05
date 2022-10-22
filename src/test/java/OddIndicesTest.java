import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
    /* Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */
    @Test
    public void testOddIndices() {

        int[] list = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(list);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOnlyEvenIndices(){
        int [] list = new int []{5};
        int[] expectedResult = new int []{};

        int[] actualResult = new OddIndices().oddIndices(list);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArray(){
        int []list = new int []{};
        int [] expectedResult = new int [0];
        int [] actualResult = new OddIndices().oddIndices(list);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
