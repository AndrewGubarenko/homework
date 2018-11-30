import hillel.jee.AndriiHubarenko.Processor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ProcessorTest {

    Processor processor = Mockito.mock(Processor.class);

    @Test
    public void performTest() {
        String a = "( 2 + 2 ) * 2 - 4 + 2 ^ 2 - 27 root 3";
        Mockito.when(processor.perform(a)).thenReturn(5.0);
        Assert.assertEquals(5.0, processor.perform(a), 0.1);
    }
}