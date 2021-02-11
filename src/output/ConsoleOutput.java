package observer;

public class ConsoleOutput implements Observer<Double> {

    @Override
    public void update(Double aDouble) {
        System.out.println(aDouble);
    }
}
