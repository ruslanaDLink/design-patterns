package patterns.creational.abstractfactory.students;

import patterns.creational.abstractfactory.abstraction.EducationFactory;
import patterns.creational.abstractfactory.abstraction.MarkingSystem;
import patterns.creational.abstractfactory.abstraction.StudentAbstract;
import patterns.creational.abstractfactory.abstraction.Subject;
import patterns.creational.abstractfactory.factories.CambridgeEducationFactory;

import java.util.HashMap;
import java.util.Map;


public class CambridgeStudent extends StudentAbstract {
    private Map<Subject, MarkingSystem.CambridgeMarkingSystem> grades;

    public CambridgeStudent(String name, int age) {
        super(name, age);
        grades = new HashMap<>();
    }

    public Map<Subject, MarkingSystem.CambridgeMarkingSystem> getGrades() {
        return grades;
    }

    @Override
    public String studentInformation() {
        return "Student of " + CambridgeEducationFactory.SCHOOL_NAME + " {" + getName() + "} {Age: " + getAge() + "}";
    }

    @Override
    public EducationFactory getSchool() {
        return new CambridgeEducationFactory();
    }
}
