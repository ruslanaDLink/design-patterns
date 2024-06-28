package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

//concrete mediator
public class GameChat implements Game {
    private List<Player> players;

    public GameChat() {
        this.players = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Player player) {
        for (Player receiver : players) {
            if (receiver != player) {
                player.sendMessage(message);
            }
        }
    }

    @Override
    public void actionOnPlayer(Action action, Player player) {
        for (Player receiver : players) {
            if (receiver != player) {
                player.sendAction(action);
            }
        }
    }
}
