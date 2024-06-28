package patterns.behavioral.mediator;

//concrete colleague
public class GamePlayer implements Player {
    private String playerName;
    private Game game;

    public GamePlayer(String playerName, Game game) {
        this.playerName = playerName;
        this.game = game;
    }

    @Override
    public String getName() {
        return playerName;
    }

    @Override
    public void sendMessage(String message, Player player) {
        sendMessage(message);
        receiveMessage(message, player);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(playerName + " sends message: " + message);
        game.sendMessage(message, this);
    }

    @Override
    public void sendAction(Action action, Player player) {
        sendAction(action);
        receiveAction(action, player);
    }

    @Override
    public void sendAction(Action action) {
        System.out.println(playerName + " sends action: " + action);
        game.actionOnPlayer(action, this);
    }

    @Override
    public void receiveMessage(String message, Player player) {
        System.out.println(player.getName() + " receives message: " + message);
    }

    @Override
    public void receiveAction(Action action, Player player) {
        System.out.println(player.getName() + " receives action: " + action);
    }

}
