import hillel.jee.AndriiHubarenko.Processor;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProcessorTest {

    @Autowired
    Processor processor;

    @Test
    public void performTest() {
        String a = "( 2 + 2 ) * 2 - 4 + 2 ^ 2 - 27 root 3";
        Assert.assertEquals(5.0, processor.perform(a), 0.01);
    }
}