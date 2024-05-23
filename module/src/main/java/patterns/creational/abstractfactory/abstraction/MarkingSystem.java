package patterns.creational.abstractfactory.abstraction;

public interface MarkingSystem {

     enum CambridgeMarkingSystem{
        A,
        B,
        C,
        D,
        E,
        F,
        G
    }

    enum OxfordMarkingSystem{
        //A
        FIRST_CLASS_HONOURS,

        //A-, B+, B
        SECOND_CLASS_HONOURS,

        //C+
        THIRD_CLASS,

        //C, S
        PASS,

        //F
        FAIL
    }

    enum StanfordMarkingSystem{
        A,
        B,
        C,
        D,
        NOT_PASSED,
        NO_CREDIT,
        CREDIT,
        //pass
        L,
        //withdraw
        W,
        //continuing course
        N,
        //incomplete
        I,
        REPEATED_COURSE,
        GRADE_NOT_REPORTED
    }

}
