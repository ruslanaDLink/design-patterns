package patterns.creational.factory;

import patterns.creational.factory.formatters.Formatter;
import patterns.creational.factory.formatters.NumberFormatter;

public class NumberFactory implements Factory{

    @Override
    public Formatter createFactoryFormatter() {
        return new NumberFormatter();
    }
}
