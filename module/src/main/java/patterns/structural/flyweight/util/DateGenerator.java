package patterns.structural.flyweight.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateGenerator {

    public Date getExpirationDate(Date productionDate, int minTime, int maxTime){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(productionDate);
        calendar.add(Calendar.DAY_OF_YEAR, new Random().nextInt(minTime, maxTime));
        return calendar.getTime();
    }
}
