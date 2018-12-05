
import hillel.jee.AndriiHubarenko.CalculationMethods.*;
import hillel.jee.AndriiHubarenko.Processor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Processor.class, CalculationMethods.class, Sum.class, Subtraction.class, Root.class, Multiplication.class, Exponentiation.class, Division.class })
public class CommonMethodsTest {

    @Autowired
    CalculationMethods methods;

    @Test
    public void sumTest() {
        Assert.assertEquals(4.0, ((Sum)methods.getMap().get("sum")).calc(2.0, 2.0), 0.01);
    }
    @Test
    public void subtractionTest() {
        Assert.assertEquals(2.0, ((Subtraction)methods.getMap().get("subtraction")).calc(4.0,2.0), 0.01);
    }
    @Test
    public void multiplicationTest() {
        Assert.assertEquals(4.0, ((Multiplication)methods.getMap().get("multiplication")).calc(2.0,2.0), 0.01);
    }
    @Test
    public void divisionTest() {
        Assert.assertEquals(2.0, ((Division)methods.getMap().get("division")).calc(4.0,2.0), 0.01);
    }
    @Test
    public void exponentiationTest() {
        Assert.assertEquals(4.0, ((Exponentiation)methods.getMap().get("exponentiation")).calc(2.0,2.0), 0.01);
    }
    @Test
    public void rootTest() {
        Assert.assertEquals(3.0, ((Root)methods.getMap().get("root")).calc(27.0,3.0), 0.01);
    }
}
