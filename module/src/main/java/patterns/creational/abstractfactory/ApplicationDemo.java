package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.abstraction.MarkingSystem;
import patterns.creational.abstractfactory.abstraction.StudentAbstract;
import patterns.creational.abstractfactory.abstraction.Subject;
import patterns.creational.abstractfactory.factories.CambridgeEducationFactory;
import patterns.creational.abstractfactory.students.CambridgeStudent;
import patterns.creational.abstractfactory.subjects.humanities.EnglishLiterature;
import patterns.creational.abstractfactory.subjects.languages.Arabic;
import patterns.creational.abstractfactory.subjects.sciences.Chemistry;
import patterns.creational.abstractfactory.subjects.humanities.History;
import patterns.creational.abstractfactory.subjects.mathematics.Algebra;
import patterns.creational.abstractfactory.subjects.humanities.Sociology;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApplicationDemo {
    private static final CambridgeEducationFactory cambridge = new CambridgeEducationFactory();

    public static void main(String[] args) {
        CambridgeStudent paulKaufman = new CambridgeStudent("Paul Kaufman", 21);
        CambridgeStudent haileyHonduras = new CambridgeStudent("Hailey Honduras", 19);
        CambridgeStudent joeDallison = new CambridgeStudent("Joe Dallison", 21);
        CambridgeStudent nevillePittman = new CambridgeStudent("Neville Pittman", 21);

        cambridge.addStudent(paulKaufman);
        cambridge.addStudent(haileyHonduras);
        cambridge.addStudent(joeDallison);
        cambridge.addStudent(nevillePittman);


        Chemistry chemistry = new Chemistry();
        Algebra algebra = new Algebra();
        Sociology sociology = new Sociology();
        History history = new History();
        Arabic arabic = new Arabic();
        EnglishLiterature englishLiterature = new EnglishLiterature();

        cambridge.addSubject(chemistry);
        cambridge.addSubject(sociology);
        cambridge.addSubject(algebra);
        cambridge.addSubject(history);
        cambridge.addSubject(algebra);
        cambridge.addSubject(englishLiterature);


        List<StudentAbstract> cambridgeStudentsList = cambridge.getCambridgeStudentsList();
        for (StudentAbstract studentAbstract : cambridgeStudentsList) {
            System.out.println(studentAbstract.studentInformation());
        }
        List<Subject> cambridgeSubjects = cambridge.subjects();
        for (Subject cambridgeSubject : cambridgeSubjects) {
            System.out.println(cambridgeSubject.getSubject());
        }

        Map<Subject, MarkingSystem.CambridgeMarkingSystem> paulKaufmanGrades = paulKaufman.getGrades();
        paulKaufmanGrades.put(chemistry, MarkingSystem.CambridgeMarkingSystem.B);
        paulKaufmanGrades.put(algebra, MarkingSystem.CambridgeMarkingSystem.C);
        paulKaufmanGrades.put(sociology, MarkingSystem.CambridgeMarkingSystem.A);
        paulKaufmanGrades.put(history, MarkingSystem.CambridgeMarkingSystem.A);
        paulKaufmanGrades.put(arabic, MarkingSystem.CambridgeMarkingSystem.C);
        paulKaufmanGrades.put(englishLiterature, MarkingSystem.CambridgeMarkingSystem.B);

        Set<Map.Entry<Subject, MarkingSystem.CambridgeMarkingSystem>> entries = paulKaufmanGrades.entrySet();
        System.out.println("Paul Kaufman grades");
        for (Map.Entry<Subject, MarkingSystem.CambridgeMarkingSystem> entry : entries) {
            System.out.println(entry.getKey().getSubject() + " : "+entry.getValue());
        }
    }
}
