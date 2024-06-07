package patterns.structural.decorator.decorators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.structural.decorator.components.SingleString;


class ReversedStringTest {

    @Test
    void getSingleWord() {
        //given
        ReversedString reversedStringClass = new ReversedString(new SingleString());
        String word = "reversed";

        //when
        String reversedWord = reversedStringClass.getSingleWord(word);

        String reversedByBuilder = new StringBuilder().append(word).reverse().toString();

        //then
        Assertions.assertEquals(reversedWord, reversedByBuilder, "error reversing string");

    }
}