package patterns.creational.abstractfactory.subjects.mathematics;

import patterns.creational.abstractfactory.abstraction.Subject;

public class Geometry implements Subject {
    @Override
    public String getSubject() {
        return "GEOMETRY";
    }
}
