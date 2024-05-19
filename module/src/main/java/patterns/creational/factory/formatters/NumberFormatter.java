package patterns.creational.factory.formatters;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatter implements Formatter {
    private static final String NUMBER_FORMATTER = "NUMBER FORMATTER";

    @Override
    public String getFormatter() {
        return NUMBER_FORMATTER;
    }

    @Override
    public void format(String value) {
        int formattedValue = 0;
        try {
            formattedValue = NumberFormat.getInstance().parse(value).intValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        new PrintStream(System.out).println(formattedValue);
    }
}
