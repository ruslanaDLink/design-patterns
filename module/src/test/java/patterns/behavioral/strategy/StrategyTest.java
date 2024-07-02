package patterns.behavioral.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.behavioral.strategy.operations.Addition;
import patterns.behavioral.strategy.operations.Division;
import patterns.behavioral.strategy.operations.Multiplication;
import patterns.behavioral.strategy.operations.Subtraction;

class StrategyTest {

    @Test
    public void test() {
        //given
        CalculationExecutor additionExecutor = new CalculationExecutor(new Addition());
        CalculationExecutor subtractionExecutor = new CalculationExecutor(new Subtraction());
        CalculationExecutor multiplicationExecutor = new CalculationExecutor(new Multiplication());
        CalculationExecutor divisionExecutor = new CalculationExecutor(new Division());


        //when
        int addResult = additionExecutor.executeCalculation(344, 573);
        int subtractResult = subtractionExecutor.executeCalculation(500, 300);
        int multiplyResult = multiplicationExecutor.executeCalculation(18, 99);
        int divideResult = divisionExecutor.executeCalculation(1000, 2);


        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(917, addResult, "addition error"),
                () -> Assertions.assertEquals(200, subtractResult, "subtraction error"),
                () -> Assertions.assertEquals(1782, multiplyResult, "multiplication error"),
                () -> Assertions.assertEquals(500, divideResult, "division error")
        );

    }

}