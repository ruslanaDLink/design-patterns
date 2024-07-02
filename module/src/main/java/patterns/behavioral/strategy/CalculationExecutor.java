package patterns.behavioral.strategy;

public class CalculationExecutor {
    private Calculator calculator;

    public CalculationExecutor(Calculator calculator) {
        this.calculator = calculator;
    }

    public int executeCalculation(int number1, int number2) {
        return calculator.calculateInteger(number1, number2);
    }

    public double executeCalculation(double number1, double number2) {
        return calculator.calculateDouble(number1, number2);
    }
}
