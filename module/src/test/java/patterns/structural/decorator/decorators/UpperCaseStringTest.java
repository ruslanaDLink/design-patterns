package patterns.structural.decorator.decorators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.structural.decorator.components.SingleString;

class UpperCaseStringTest {

    @Test
    void getSingleWord() {
        //given
        UpperCaseString upperCaseStringClass = new UpperCaseString(new SingleString());
        String word = "uppercase";
        String error = "failed to uppercase";

        //when
        String upperCaseWord = upperCaseStringClass.getSingleWord(word);

        //then
        Assertions.assertAll(
                () -> Assertions.assertNotEquals(word, upperCaseWord, error),
                () -> Assertions.assertEquals(word.toUpperCase(), upperCaseWord, error));
    }
}