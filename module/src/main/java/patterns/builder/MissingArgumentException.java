package patterns.builder;

public class MissingArgumentException extends Exception {
    private String cause;

    public MissingArgumentException(String cause) {
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return "Argument is missing. Ensure avoiding null values. The cause in the " + cause + " argument.";
    }
}
