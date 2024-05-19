package patterns.creational.factory;

import patterns.creational.factory.formatters.Formatter;

public interface Factory {
    Formatter createFactoryFormatter();
}
