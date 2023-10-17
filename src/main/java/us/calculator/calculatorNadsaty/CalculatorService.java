package us.calculator.calculatorNadsaty;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    @Override
    public String calculator() {return "Welcome to the calculator!";}
    @Override
    public int plus(int num1, int num2) {return num1 + num2;}
    @Override
    public int minus(int num1, int num2) {return num1 - num2;}
    @Override
    public int multiply(int num1, int num2) {return num1 * num2;}
    @Override
    public int divide(int num1, int num2) {return num1 / num2;}
}
