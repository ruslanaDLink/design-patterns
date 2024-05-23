package patterns.creational.abstractfactory.abstraction;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public abstract class StudentAbstract {
    private String name;
    private int age;
    private List<Subject> subjectList;

    public StudentAbstract(String name, int age) {
        this.name = name;
        this.age = age;
        subjectList = new ArrayList<>();
    }

    public abstract EducationFactory getSchool();

    public abstract String studentInformation();

    public List<Subject> getSubjectList() {
        return subjectList;
    }
}
