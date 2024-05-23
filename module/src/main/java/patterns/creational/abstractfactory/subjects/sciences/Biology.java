package patterns.creational.abstractfactory.subjects.sciences;

import patterns.creational.abstractfactory.abstraction.Subject;

public class Biology implements Subject {
    @Override
    public String getSubject() {
        return "BIOLOGY";
    }
}
