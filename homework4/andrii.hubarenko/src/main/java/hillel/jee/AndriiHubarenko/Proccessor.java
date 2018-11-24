package hillel.jee.AndriiHubarenko;

import hillel.jee.AndriiHubarenko.CalculationMethods.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Proccessor {

    @Autowired
    Sum sum;
    @Autowired
    Subtraction subtraction;
    @Autowired
    Multiplication multiplication;
    @Autowired
    Division division;
    @Autowired
    Exception exception;
    @Autowired
    SquareRoot squareRoot;

    public double disassemble(String str) {
        List result = new ArrayList();
        String[] input = str.split(" ");

        for (int i = 0; i < input.length; i++) {
            if (input[i].matches("[-+]?\\d+")) {
                result.add(Double.parseDouble(input[i] + ".0"));
            } else if (input[i].matches("-?\\d+(\\.\\d+)?")) {
                result.add(Double.parseDouble(input[i]));
            } else {
                result.add(input[i]);
            }
        }

        return calculate(result);
    }

    public double calculate(List list) {
        double result = (double) list.get(0);

        if(list.size() > 2) {
            for(int i = 1; i < list.size(); i++) {
                if(list.get(i).equals("+")) {
                    result = (double) sum.sum(result, (double) list.get(i+1));
                } else if(list.get(i).equals("-")) {
                    result = (double) subtraction.subtraction(result, (double) list.get(i+1));
                }
            }
        }
        return result;
    }
}
