package patterns.creational.abstractfactory.abstraction;

import java.util.List;

public interface EducationFactory {
    List<StudentAbstract> students();

    void addStudent(StudentAbstract student);

    void removeStudent(StudentAbstract student);

    List<Subject> subjects();

    void addSubject(Subject subject);

    void removeSubject(Subject subject);

    String[] getMarkingSystem();
}
