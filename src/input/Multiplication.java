package input_types;

public class Multiplication implements Operator {

    @Override
    public double calculate(double firstParameter, double secondParameter) {
        return firstParameter * secondParameter;
    }
}
