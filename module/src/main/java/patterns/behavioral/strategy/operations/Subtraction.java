package patterns.behavioral.strategy.operations;

import patterns.behavioral.strategy.Calculator;

public class Subtraction implements Calculator {

    @Override
    public int calculateInteger(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public double calculateDouble(double number1, double number2) {
        return number1 - number2;
    }
}
