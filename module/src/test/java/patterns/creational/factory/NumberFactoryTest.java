package patterns.creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.creational.factory.formatters.Formatter;

import static org.junit.jupiter.api.Assertions.*;

class NumberFactoryTest {

    @Test
    void createFactoryFormatter() {
        //given
        NumberFactory numberFactory = new NumberFactory();

        //when
        Formatter factoryFormatter = numberFactory.createFactoryFormatter();

        //then
        Assertions.assertNotNull(factoryFormatter, "Failed to create Number Factory's object.");

    }
}