package input_types;

public class OperatorFactory {

    public Operator getOperator(String operatorType) {
        switch (operatorType) {
            case "+":
                return new Addition();
            case "-":
                return new Substraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
                default:
                    return null;
        }
    }
}
