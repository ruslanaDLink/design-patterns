package patterns.creational.abstractfactory.subjects.humanities;

import patterns.creational.abstractfactory.abstraction.Subject;

public class EnglishLiterature implements Subject {
    @Override
    public String getSubject() {
        return "ENGLISH LITERATURE";
    }
}
