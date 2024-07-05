package patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;
import patterns.behavioral.visitor.employee.BackendDeveloper;

import java.util.Map;

class VisitorTest {

    @Test
    public void test() {
        Visitor visitor = new VisitorImpl();

        BackendDeveloper backendDeveloper = new BackendDeveloper(22, "Johny Woods");
        backendDeveloper.accept(visitor);

        Map<String, Attendance> attendanceMap = backendDeveloper.meetingsPresence();
        attendanceMap.put("Java SOLID principles and Design Patterns", Attendance.ATTENDED);
        attendanceMap.put("Python for a rookie", Attendance.NOT_ATTENDED);
        attendanceMap.put("Java Advance Course", Attendance.ATTENDED);

        visitor.visit(backendDeveloper);
    }
}