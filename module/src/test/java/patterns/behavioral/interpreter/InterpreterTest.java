package patterns.behavioral.interpreter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InterpreterTest {

    @Test
    public void interpret() {
        //given
        Interpreter numberInterpreter = new NumberInterpreter();
        Interpreter multiplyInterpreter = new MultiplyInterpreter(numberInterpreter, numberInterpreter);
        Interpreter concatInterpreter = new ConcatInterpreter(numberInterpreter, numberInterpreter);
        String testNumber = "10";

        //when
        int interpreted = numberInterpreter.interpret(new Context(testNumber));
        int multiplied = multiplyInterpreter.interpret(new Context(testNumber));
        int concatenation = concatInterpreter.interpret(new Context(testNumber));

        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(10, interpreted, "Number interpretation went wrong."),
                () -> Assertions.assertEquals(100, multiplied, "Multiplication went wrong."),
                () -> Assertions.assertEquals(1010, concatenation, "Concatenation went wrong.")
        );
    }
}