import hillel.jee.AndriiHubarenko.CalculationMethods.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CommonMethodsTest {
    Calculation sum = Mockito.mock(Sum.class);
    Calculation subtraction = Mockito.mock(Subtraction.class);
    Calculation multiplication = Mockito.mock(Multiplication.class);
    Calculation division = Mockito.mock(Division.class);
    Calculation exponentiation = Mockito.mock(Exponentiation.class);
    Calculation root = Mockito.mock(Root.class);

    @Test
    public void sumTest() {
        Mockito.when(sum.calc(2, 2)).thenReturn(4.0);
        Assert.assertEquals(4.0, sum.calc(2.0, 2.0), 0.01);
    }
    @Test
    public void subtractionTest() {
        Mockito.when(subtraction.calc(4, 2)).thenReturn(2.0);
        Assert.assertEquals(2.0, subtraction.calc(4.0,2.0), 0.01);
    }
    @Test
    public void multiplicationTest() {
        Mockito.when(multiplication.calc(2, 2)).thenReturn(4.0);
        Assert.assertEquals(4.0, multiplication.calc(2.0,2.0), 0.01);
    }
    @Test
    public void divisionTest() {
        Mockito.when(division.calc(4, 2)).thenReturn(2.0);
        Assert.assertEquals(2.0, division.calc(4.0,2.0), 0.01);
    }
    @Test
    public void exponentiationTest() {
        Mockito.when(exponentiation.calc(2, 2)).thenReturn(4.0);
        Assert.assertEquals(4.0, exponentiation.calc(2.0,2.0), 0.01);
    }
    @Test
    public void rootTest() {
        Mockito.when(root.calc(27, 3)).thenReturn(3.0);
        Assert.assertEquals(3.0, root.calc(27.0,3.0), 0.01);
    }
}
