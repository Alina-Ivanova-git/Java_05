import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    /* Проверьте работу метода на числах 555, 0 и -555
     */
    @Test
    public void isPositiveNumberTest_PositiveNumb(){
        int a = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void isPositiveNumberTest_Zero(){
        int a = 0;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void isPositiveNumberTest_Neg(){
        int a = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
