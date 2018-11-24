package hillel.jee.AndriiHubarenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellInterface{

    @Autowired
    Proccessor proccessor;

    @ShellMethod("Sum of two integers")
    public double count (String a) {


        return proccessor.stringProcessing(a);
    }
}
