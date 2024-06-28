package patterns.behavioral.interpreter;

//terminal
public class NumberInterpreter implements Interpreter {

    @Override
    public int interpret(Context context) {
        String str = context.getContext();
        if (str.contains("[a-zA-Z]")) {
            str = str.replaceAll("[^a-zA-Z]", "");
        }
        return Integer.parseInt(str);
    }
}
