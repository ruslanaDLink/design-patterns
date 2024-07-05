package patterns.behavioral.visitor;

import java.util.Map;

public class MeetingReportClass {

    public void getMeetingReport(int id, String name, Map<String, Attendance> meetingReport) {
        System.out.println("#" + id + " " + name + " meeting report");
        System.out.println("---------------------------------------");
        for (Map.Entry<String, Attendance> entry : meetingReport.entrySet()) {
            System.out.println("Meeting: " + entry.getKey() + "\t\t Attendance: " + entry.getValue());
        }
        System.out.println("---------------------------------------");
    }
}
