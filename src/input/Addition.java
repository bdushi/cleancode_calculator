package input_types;

public class Addition implements Operator {

    @Override
    public double calculate(double firstParameter, double secondParameter) {
        return firstParameter + secondParameter;
    }
}
