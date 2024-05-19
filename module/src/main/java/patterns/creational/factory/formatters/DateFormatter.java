package patterns.creational.factory.formatters;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter implements Formatter {
    private static final String DATE_FORMATTER = "DATE FORMATTER";

    @Override
    public String getFormatter() {
        return DATE_FORMATTER;
    }

    @Override
    public void format(String value) {
        Date formattedDate = null;
        try {
            formattedDate = SimpleDateFormat.getInstance().parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        new PrintStream(System.out).println(formattedDate);
    }
}
