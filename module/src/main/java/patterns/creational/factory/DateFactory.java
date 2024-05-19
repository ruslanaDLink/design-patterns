package patterns.creational.factory;

import patterns.creational.factory.formatters.DateFormatter;
import patterns.creational.factory.formatters.Formatter;

public class DateFactory implements Factory {

    @Override
    public Formatter createFactoryFormatter() {
       return new DateFormatter();
    }
}
