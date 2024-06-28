package patterns.behavioral.mediator;

//mediator
public interface Game {
    void sendMessage(String message, Player player);
    void actionOnPlayer(Action action, Player player);
}
