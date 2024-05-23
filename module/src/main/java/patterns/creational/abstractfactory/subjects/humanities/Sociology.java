package patterns.creational.abstractfactory.subjects.humanities;

import patterns.creational.abstractfactory.abstraction.Subject;

public class Sociology implements Subject {
    @Override
    public String getSubject() {
        return "SOCIOLOGY";
    }
}
