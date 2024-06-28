package patterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

class MediatorTest {

    @Test
    public void test() {
        Game huntGame = new GameChat();

        Player dungeonDiva = new GamePlayer("DungeonDiva", huntGame);
        Player lunarLord = new GamePlayer("LunarLord", huntGame);
        Player dreadPirate = new GamePlayer("DreadPirate", huntGame);
        Player ghostRider = new GamePlayer("GhostRider", huntGame);
        Player lynch = new GamePlayer("Lynch", huntGame);

        dreadPirate.sendMessage("Hello, everyone!");
        dungeonDiva.sendMessage("Hello, DreadPirate!", dreadPirate);
        dungeonDiva.sendMessage("Hello, you all!");
        ghostRider.sendAction(Action.WAVE);
        lynch.sendMessage("Will do remake today?", lunarLord);
        lunarLord.sendMessage("Probably! Couldn't wait all day for that!", lynch);
        lynch.sendAction(Action.POKE);
    }
}