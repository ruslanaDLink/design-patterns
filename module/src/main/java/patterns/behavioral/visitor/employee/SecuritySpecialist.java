package patterns.behavioral.visitor.employee;

import patterns.behavioral.visitor.AbstractEmployee;
import patterns.behavioral.visitor.Attendance;
import patterns.behavioral.visitor.MeetingReportClass;
import patterns.behavioral.visitor.Visitor;

import java.util.HashMap;
import java.util.Map;

public class SecuritySpecialist extends AbstractEmployee {
    private Map<String, Attendance> securitySpecialistMeetingPresence;
    private MeetingReportClass helperClass;

    public SecuritySpecialist(int id, String name) {
        super(id, name);
        securitySpecialistMeetingPresence = new HashMap<>();
        helperClass = new MeetingReportClass();
    }

    @Override
    public Map<String, Attendance> meetingsPresence() {
        return securitySpecialistMeetingPresence;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void getMeetingReport() {
        System.out.println("SECURITY DEPARTMENT");
        helperClass.getMeetingReport(getId(), getName(), securitySpecialistMeetingPresence);
    }

    public void setSecuritySpecialistMeetingPresence(Map<String, Attendance> securitySpecialistMeetingPresence) {
        this.securitySpecialistMeetingPresence = securitySpecialistMeetingPresence;
    }
}
