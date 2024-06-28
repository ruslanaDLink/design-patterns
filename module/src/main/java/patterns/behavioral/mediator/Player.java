package patterns.behavioral.mediator;

//colleague
public interface Player {
    String getName();

    void sendMessage(String message, Player player);

    void sendMessage(String message);

    void sendAction(Action action, Player player);

    void sendAction(Action action);

    void receiveMessage(String message, Player player);

    void receiveAction(Action action, Player player);
}
