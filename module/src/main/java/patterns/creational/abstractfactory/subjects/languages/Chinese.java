package patterns.creational.abstractfactory.subjects.languages;

import patterns.creational.abstractfactory.abstraction.Subject;

public class Chinese implements Subject {
    @Override
    public String getSubject() {
        return "CHINESE";
    }
}
