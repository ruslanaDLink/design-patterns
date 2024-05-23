package patterns.creational.abstractfactory.subjects.sciences;

import patterns.creational.abstractfactory.abstraction.Subject;

public class Chemistry implements Subject {
    @Override
    public String getSubject() {
        return "CHEMISTRY";
    }
}
