package patterns.behavioral.visitor.employee;

import patterns.behavioral.visitor.AbstractEmployee;
import patterns.behavioral.visitor.Attendance;
import patterns.behavioral.visitor.MeetingReportClass;
import patterns.behavioral.visitor.Visitor;

import java.util.HashMap;
import java.util.Map;

public class WebDeveloper extends AbstractEmployee {
    private Map<String, Attendance> webDeveloperMeetingPresence;
    private MeetingReportClass helper;

    public WebDeveloper(int id, String name) {
        super(id, name);
        webDeveloperMeetingPresence = new HashMap<>();
        helper = new MeetingReportClass();
    }

    @Override
    public Map<String, Attendance> meetingsPresence() {
        return webDeveloperMeetingPresence;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void getMeetingReport() {
        System.out.println("WEB DEVELOPMENT DEPARTMENT");
        helper.getMeetingReport(getId(), getName(), webDeveloperMeetingPresence);
    }

    public Map<String, Attendance> getWebDeveloperMeetingPresence() {
        return webDeveloperMeetingPresence;
    }

    public void setWebDeveloperMeetingPresence(Map<String, Attendance> webDeveloperMeetingPresence) {
        this.webDeveloperMeetingPresence = webDeveloperMeetingPresence;
    }
}
