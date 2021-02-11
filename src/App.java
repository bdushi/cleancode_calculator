import observer.ConsoleOutput;
import observer.GuiOutput;

import java.util.Scanner;

import controllers.InputController;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstInput = sc.next();
        System.out.println("Operation you want to execute: ");
        String operator = sc.next();
        System.out.println("Enter the second number: ");
        String secondInput = sc.next();

        double firstOperand = Double.parseDouble(firstInput);
        double secondOperand = Double.parseDouble(secondInput);

        InputController inputController = InputController.getInputController();
        inputController.registerObserver(new ConsoleOutput());
        inputController.registerObserver(new GuiOutput());
        inputController.add(firstOperand, secondOperand, operator);

    }
}
