package patterns.behavioral.visitor.employee;

import patterns.behavioral.visitor.AbstractEmployee;
import patterns.behavioral.visitor.Attendance;
import patterns.behavioral.visitor.MeetingReportClass;
import patterns.behavioral.visitor.Visitor;

import java.util.HashMap;
import java.util.Map;

public class BackendDeveloper extends AbstractEmployee {
    private Map<String, Attendance> backendDeveloperMeetingPresence;
    private MeetingReportClass helperClass;

    public BackendDeveloper(int id, String name) {
        super(id, name);
        backendDeveloperMeetingPresence = new HashMap<>();
        helperClass = new MeetingReportClass();
    }

    @Override
    public Map<String, Attendance> meetingsPresence() {
        return backendDeveloperMeetingPresence;
    }

    public void getMeetingReport() {
        System.out.println("BACKEND DEVELOPMENT DEPARTMENT");
        helperClass.getMeetingReport(getId(), getName(), backendDeveloperMeetingPresence);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Map<String, Attendance> getBackendDeveloperMeetingPresence() {
        return backendDeveloperMeetingPresence;
    }

    public void setBackendDeveloperMeetingPresence(Map<String, Attendance> backendDeveloperMeetingPresence) {
        this.backendDeveloperMeetingPresence = backendDeveloperMeetingPresence;
    }
}
