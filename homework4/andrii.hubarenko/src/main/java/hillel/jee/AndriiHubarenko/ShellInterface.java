package hillel.jee.AndriiHubarenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * The class {@link ShellInterface} is used for interaction with application
 * using a command line
 */
@ShellComponent
public class ShellInterface{

    @Autowired
    Processor processor;

    @ShellMethod("Sum of two integers")
    public double count (String a) {
        return processor.perform(a);
    }
}
