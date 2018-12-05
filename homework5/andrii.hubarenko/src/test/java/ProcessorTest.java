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
public class ProcessorTest {

    @Autowired
    Processor processor;

    @Test
    public void performTest() {
        String a = "( 2 + 2 ) * 2 - 4 + 2 ^ 2 - 27 root 3";
        Assert.assertEquals(5.0, processor.perform(a), 0.1);
    }
}
