package patterns.behavioral.interpreter;

//non-terminal
public class MultiplyInterpreter implements Interpreter {
    private Interpreter mainInterpreter;
    private Interpreter secondaryInterpreter;

    public MultiplyInterpreter(Interpreter mainInterpreter, Interpreter secondaryInterpreter) {
        this.mainInterpreter = mainInterpreter;
        this.secondaryInterpreter = secondaryInterpreter;
    }

    @Override
    public int interpret(Context context) {
        return mainInterpreter.interpret(context) * secondaryInterpreter.interpret(context);
    }

    @Override
    public String toString() {
        return mainInterpreter + " MULTIPLY " + secondaryInterpreter;
    }
}
