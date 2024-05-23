package patterns.creational.abstractfactory.students;

import patterns.creational.abstractfactory.abstraction.EducationFactory;
import patterns.creational.abstractfactory.abstraction.MarkingSystem;
import patterns.creational.abstractfactory.abstraction.StudentAbstract;
import patterns.creational.abstractfactory.abstraction.Subject;
import patterns.creational.abstractfactory.factories.StanfordEducationFactory;

import java.util.HashMap;
import java.util.Map;

public class StanfordStudent extends StudentAbstract {
    private Map<Subject, MarkingSystem.StanfordMarkingSystem> grades;

    public StanfordStudent(String name, int age) {
        super(name, age);
        grades = new HashMap<>();
    }

    public Map<Subject, MarkingSystem.StanfordMarkingSystem> getGrades() {
        return grades;
    }

    @Override
    public String studentInformation() {
        return "Student of " + StanfordEducationFactory.SCHOOL_NAME + " {" + getName() + "} {Age: " + getAge() + "}";
    }

    @Override
    public EducationFactory getSchool() {
        return new StanfordEducationFactory();
    }
}
