import hillel.jee.AndriiHubarenko.CalculationMethods.*;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CommonMethodsTest {
    @Mock
    Calculation sum;
    @Mock
    Calculation subtraction;
    @Mock
    Calculation multiplication;
    @Mock
    Calculation division;
    @Mock
    Calculation exponentiation;
    @Mock
    Calculation root;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void sumTest() {
        Mockito.when(sum.calc(2, 2)).thenReturn(4.0);
        Assert.assertEquals(4.0, sum.calc(2.0, 2.0), 0.01);
        Mockito.verify(sum).calc(2, 2);
    }
    @Test
    public void subtractionTest() {
        Mockito.when(subtraction.calc(4, 2)).thenReturn(2.0);
        Assert.assertEquals(2.0, subtraction.calc(4.0,2.0), 0.01);
        Mockito.verify(subtraction).calc(4, 2);
    }
    @Test
    public void multiplicationTest() {
        Mockito.when(multiplication.calc(2, 2)).thenReturn(4.0);
        Assert.assertEquals(4.0, multiplication.calc(2.0,2.0), 0.01);
        Mockito.verify(multiplication).calc(2, 2);
    }
    @Test
    public void divisionTest() {
        Mockito.when(division.calc(4, 2)).thenReturn(2.0);
        Assert.assertEquals(2.0, division.calc(4.0,2.0), 0.01);
        Mockito.verify(division).calc(4, 2);
    }
    @Test
    public void exponentiationTest() {
        Mockito.when(exponentiation.calc(2, 2)).thenReturn(4.0);
        Assert.assertEquals(4.0, exponentiation.calc(2.0,2.0), 0.01);
        Mockito.verify(exponentiation).calc(2, 2);
    }
    @Test
    public void rootTest() {
        Mockito.when(root.calc(27, 3)).thenReturn(3.0);
        Assert.assertEquals(3.0, root.calc(27.0,3.0), 0.01);
        Mockito.verify(root).calc(27, 3);
    }
}
