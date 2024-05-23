package patterns.creational.abstractfactory.factories;

import lombok.Getter;
import patterns.creational.abstractfactory.abstraction.EducationFactory;
import patterns.creational.abstractfactory.abstraction.MarkingSystem;
import patterns.creational.abstractfactory.abstraction.StudentAbstract;
import patterns.creational.abstractfactory.abstraction.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Getter
public class CambridgeEducationFactory implements EducationFactory, MarkingSystem {
    private static final Logger LOGGER = Logger.getLogger(CambridgeEducationFactory.class.getName());

    public static final String SCHOOL_NAME = "University of Cambridge";

    private List<StudentAbstract> cambridgeStudentsList;
    private List<Subject> subjects;

    public CambridgeEducationFactory() {
        cambridgeStudentsList = new ArrayList<>();
        subjects = new ArrayList<>();
    }

    @Override
    public List<Subject> subjects() {
        return subjects;
    }

    @Override
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }

    @Override
    public List<StudentAbstract> students() {
        return cambridgeStudentsList;
    }

    @Override
    public void addStudent(StudentAbstract student) {
        cambridgeStudentsList.add(student);
    }

    @Override
    public void removeStudent(StudentAbstract student) {
        cambridgeStudentsList.remove(student);
    }

    @Override
    public String[] getMarkingSystem() {
        LOGGER.info(SCHOOL_NAME + " Marking System");
        return new String[]{Arrays.toString(MarkingSystem.CambridgeMarkingSystem.values())};
    }

}
