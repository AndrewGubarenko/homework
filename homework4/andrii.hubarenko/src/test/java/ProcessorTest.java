import hillel.jee.AndriiHubarenko.Processor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ProcessorTest {

    @Mock
    Processor processor;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Test
    public void performTest() {
        String a = "( 2 + 2 ) * 2 - 4 + 2 ^ 2 - 27 root 3";
        Mockito.when(processor.perform(a)).thenReturn(5.0);
        Assert.assertEquals(5.0, processor.perform(a), 0.1);
        Mockito.verify(processor).perform(a);
    }
}