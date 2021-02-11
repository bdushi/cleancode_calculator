package input_types;

public class Division implements Operator {

    @Override
    public double calculate(double firstParameter, double secondParameter) {

        if (secondParameter == 0){
            System.out.println("Division by 0 is not possible!");
            System.exit(1);
        }
        return firstParameter / secondParameter;
    }
}
