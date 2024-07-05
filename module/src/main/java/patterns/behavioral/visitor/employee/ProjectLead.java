package patterns.behavioral.visitor.employee;

import patterns.behavioral.visitor.AbstractEmployee;
import patterns.behavioral.visitor.Attendance;
import patterns.behavioral.visitor.MeetingReportClass;
import patterns.behavioral.visitor.Visitor;

import java.util.HashMap;
import java.util.Map;

public class ProjectLead extends AbstractEmployee {
    private Map<String, Attendance> projectLeadMeetingPresence;
    private MeetingReportClass helperClass;

    public ProjectLead(int id, String name) {
        super(id, name);
        projectLeadMeetingPresence = new HashMap<>();
        helperClass =  new MeetingReportClass();
    }

    @Override
    public Map<String, Attendance> meetingsPresence() {
        return projectLeadMeetingPresence;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void getMeetingReport() {
        System.out.println("PROJECT LEAD DEPARTMENT");
        helperClass.getMeetingReport(getId(), getName(), projectLeadMeetingPresence);
    }

    public Map<String, Attendance> getProjectLeadMeetingPresence() {
        return projectLeadMeetingPresence;
    }

    public void setProjectLeadMeetingPresence(Map<String, Attendance> projectLeadMeetingPresence) {
        this.projectLeadMeetingPresence = projectLeadMeetingPresence;
    }
}
