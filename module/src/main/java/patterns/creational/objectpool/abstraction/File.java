package patterns.creational.objectpool.abstraction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class File {
    public abstract String getExtension();

    public Long getSize(java.io.File file) {
        return file.length();
    }

    public Long getFreeSpace(java.io.File file) {
        return file.getFreeSpace();
    }

    public String lastModified(java.io.File file) {
        long time = file.lastModified();
        Date date = new Date(time);
        DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        return dateFormat.format(date);
    }

}
