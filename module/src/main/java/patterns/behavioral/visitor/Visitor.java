package patterns.behavioral.visitor;

import patterns.behavioral.visitor.employee.BackendDeveloper;
import patterns.behavioral.visitor.employee.ProjectLead;
import patterns.behavioral.visitor.employee.SecuritySpecialist;
import patterns.behavioral.visitor.employee.WebDeveloper;

public interface Visitor {
    void visit(BackendDeveloper backendDeveloper);

    void visit(WebDeveloper webDeveloper);

    void visit(ProjectLead projectLead);

    void visit(SecuritySpecialist securitySpecialist);

}
