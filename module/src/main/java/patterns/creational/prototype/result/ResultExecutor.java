package patterns.creational.prototype.result;

import java.util.Random;

public class ResultExecutor {

    public FightResult executeResult() {
        int timer = 5;

        int length = new Random().nextInt(FightResult.values().length);

        try {
            while (timer > 0) {
                Thread.sleep(300);
                System.out.println("FIGHT");
                timer--;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return FightResult.values()[length];
    }

}
