package patterns.behavioral.visitor;

import patterns.behavioral.visitor.employee.BackendDeveloper;
import patterns.behavioral.visitor.employee.ProjectLead;
import patterns.behavioral.visitor.employee.SecuritySpecialist;
import patterns.behavioral.visitor.employee.WebDeveloper;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BackendDeveloper backendDeveloper) {
        backendDeveloper.getMeetingReport();
    }

    @Override
    public void visit(WebDeveloper webDeveloper) {
        webDeveloper.getMeetingReport();
    }

    @Override
    public void visit(ProjectLead projectLead) {
        projectLead.getMeetingReport();
    }

    @Override
    public void visit(SecuritySpecialist securitySpecialist) {
        securitySpecialist.getMeetingReport();
    }
}
