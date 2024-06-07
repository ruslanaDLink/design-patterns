package patterns.structural.decorator.decorators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.structural.decorator.components.SingleString;


class LowerCaseStringTest {

    @Test
    void getSingleWord() {
        //given
        LowerCaseString lowerCaseStringClass = new LowerCaseString(new SingleString());
        String word = "LOWERCASE";
        String error = "failed to lowercase";

        //when
        String lowerCaseWord = lowerCaseStringClass.getSingleWord(word);

        //then
        Assertions.assertAll(
                () -> Assertions.assertNotEquals(word, lowerCaseWord, error),
                () -> Assertions.assertEquals(word.toLowerCase(), lowerCaseWord, error));
    }
}