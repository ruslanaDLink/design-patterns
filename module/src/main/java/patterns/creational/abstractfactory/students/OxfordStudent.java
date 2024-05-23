package patterns.creational.abstractfactory.students;

import patterns.creational.abstractfactory.abstraction.EducationFactory;
import patterns.creational.abstractfactory.abstraction.MarkingSystem;
import patterns.creational.abstractfactory.abstraction.StudentAbstract;
import patterns.creational.abstractfactory.abstraction.Subject;
import patterns.creational.abstractfactory.factories.OxfordEducationFactory;

import java.util.HashMap;
import java.util.Map;

public class OxfordStudent extends StudentAbstract {
    private Map<Subject, MarkingSystem.OxfordMarkingSystem> grades;

    public OxfordStudent(String name, int age) {
        super(name, age);
        grades = new HashMap<>();
    }

    public Map<Subject, MarkingSystem.OxfordMarkingSystem> getGrades() {
        return grades;
    }

    @Override
    public String studentInformation() {
        return "Student of " + OxfordEducationFactory.SCHOOL_NAME + " {" + getName() + "} {Age: " + getAge() + "}";
    }

    @Override
    public EducationFactory getSchool() {
        return new OxfordEducationFactory();
    }
}
