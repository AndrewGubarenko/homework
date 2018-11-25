import hillel.jee.AndriiHubarenko.CalculationMethods.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonMethodsTest {
    @Autowired
    Calculation sum;
    @Autowired
    Calculation subtraction;
    @Autowired
    Calculation multiplication;
    @Autowired
    Calculation division;
    @Autowired
    Calculation exponentiation;
    @Autowired
    Calculation root;

    @Test
    public void sumTest() {
        Assert.assertEquals(4.0, sum.calc(2.0, 2.0), 0.01);
    }
    @Test
    public void subtractionTest() {
        Assert.assertEquals(2.0, subtraction.calc(4.0,2.0), 0.01);
    }
    @Test
    public void multiplicationTest() {
        Assert.assertEquals(4.0, multiplication.calc(2.0,2.0), 0.01);
    }
    @Test
    public void divisionTest() {
        Assert.assertEquals(2.0, division.calc(4.0,2.0), 0.01);
    }
    @Test
    public void exponentiationTest() {
        Assert.assertEquals(4.0, exponentiation.calc(2.0,2.0), 0.01);
    }
    @Test
    public void rootTest() {
        Assert.assertEquals(3.0, root.calc(27.0,3.0), 0.01);
    }
}
