package hillel.jee.AndriiHubarenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main method for running application.
 * For correct calculation you need to type:
 * "count -> then space -> then open quotes ->
 * -> then type the expression you are going to calculate (each parameter must be typed via space) ->
 * -> then closing quotes.
 * Also you can use the brackets to set a necessary priority.
 * Be very carefully to avoid mistyping!!!
 */
@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }
}
