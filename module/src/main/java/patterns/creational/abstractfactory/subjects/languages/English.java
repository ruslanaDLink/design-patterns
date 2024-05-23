package patterns.creational.abstractfactory.subjects.languages;

import patterns.creational.abstractfactory.abstraction.Subject;

public class English implements Subject {
    @Override
    public String getSubject() {
        return "ENGLISH";
    }
}
