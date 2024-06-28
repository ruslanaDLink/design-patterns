package patterns.behavioral.interpreter;

//non-terminal
public class ConcatInterpreter implements Interpreter {
    private Interpreter mainInterpreter;
    private Interpreter secondaryInterpreter;

    public ConcatInterpreter(Interpreter mainInterpreter, Interpreter secondaryInterpreter) {
        this.mainInterpreter = mainInterpreter;
        this.secondaryInterpreter = secondaryInterpreter;
    }

    @Override
    public int interpret(Context context) {
        int interpretedByMain = mainInterpreter.interpret(context);
        int interpretedBySecondary = secondaryInterpreter.interpret(context);
        String s1 = Integer.toString(interpretedByMain);
        String s2 = Integer.toString(interpretedBySecondary);
        return Integer.parseInt(s1.concat(s2));
    }

    @Override
    public String toString() {
        return mainInterpreter + " CONCAT " + secondaryInterpreter;
    }
}
