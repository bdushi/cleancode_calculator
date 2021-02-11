package controllers;

import input.OperatorFactory;
import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class InputController implements Subject<Double> {
    private final List<Observer<Double>> observers = new ArrayList<>();
    private final OperatorFactory operatorFactory = new OperatorFactory();
    private static final InputController inputController = new InputController();

    private InputController() { }

    public static InputController getInputController(){
        return inputController;
    }

    @Override
    public void registerObserver(Observer<Double> o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer<Double> o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(Double aDouble) {
        for (Observer o: observers) {
            o.update(aDouble);
        }
    }

    public void add(double forstOperand, double secondOperand, String operator) {
        notifyObserver(operatorFactory.getOperator(operator).calculate(forstOperand, secondOperand));
    }
}
