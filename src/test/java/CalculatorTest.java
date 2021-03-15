import org.junit.*;

public class CalculatorTest {

    //private Calculator calculator1;



    @Test
    public void testSquareRoot() {
        double x = 16 ;
        double expectedResult = 4.0;
        double actualResult = Calculator.square_root(x);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testFactorial() {
        int a = 5;
        double expectedResult = 120;
        double actualResult = Calculator.factorial(a);
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void testNatLog() {
        double x  = 10 ;
        double expectedResult = 2.302585;
        double actualResult = Calculator.natural_log(x);
        Assert.assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void testPower() {
        double a = 3.0;
        double b = 4.0;
        double expectedResult = 81.0;
        double result = Calculator.power(a, b);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

}
