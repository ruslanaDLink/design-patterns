package patterns.creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.creational.factory.formatters.Formatter;

import static org.junit.jupiter.api.Assertions.*;

class DateFactoryTest {

    @Test
    void createFactoryFormatter() {
        //given
        DateFactory dateFactory = new DateFactory();

        //when
        Formatter factoryFormatter = dateFactory.createFactoryFormatter();

        //then
        Assertions.assertNotNull(factoryFormatter, "Failed to create Date Factory's object.");
    }
}