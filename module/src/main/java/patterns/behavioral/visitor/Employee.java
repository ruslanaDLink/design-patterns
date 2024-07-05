package patterns.behavioral.visitor;

import java.util.Map;

public interface Employee {
    Map<String, Attendance> meetingsPresence();
    void accept(Visitor visitor);
}
