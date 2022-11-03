import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    /* createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    public void createIntArrayTest () {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    /* createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */
    public void createDoubleArrayTest () {
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    /* Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public void createStringArrayTest () {
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void createArrayFromTextTest (){
        String a = "It was an apple pie";
        String [] expectedResult = {"It", "was", "an", "apple", "pie"};
        String [] actualResult = new CreateArray().createArrayFromText(a);
        Assert.assertEquals(actualResult, expectedResult);

    }

}

