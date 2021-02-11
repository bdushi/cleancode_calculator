package input_types;

public class Substraction implements Operator {

    @Override
    public double calculate(double firstParameter, double secondParameter) {
        return firstParameter - secondParameter;
    }
}
