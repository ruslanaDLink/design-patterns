package patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import patterns.creational.prototype.result.FightResult;
import patterns.creational.prototype.result.ResultExecutor;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

//prototype
@Getter
@Setter
public abstract class Character implements Cloneable {
    protected String name;
    protected String strength;
    protected String weapon;
    protected int loses;
    protected int wins;
    protected int drawbacks;

    private Map<FightResult, Integer> scores = new HashMap<>();

    public abstract void reset();

    public void fight() {
        FightResult result = new ResultExecutor().executeResult();

        if (result == FightResult.LOSER) {
            loses++;
            scores.put(FightResult.LOSER, loses);
        } else if (result == FightResult.WINNER) {
            wins++;
            scores.put(FightResult.WINNER, wins);
        } else if (result == FightResult.DRAWBACK) {
            drawbacks++;
            scores.put(FightResult.DRAWBACK, drawbacks);
        }
        new PrintStream(System.out).println(name + " " + result);
    }


    @Override
    public Character clone() throws CloneNotSupportedException {
        Character clonedCharacter = (Character) super.clone();
        clonedCharacter.setName(name);
        clonedCharacter.setStrength(strength);
        clonedCharacter.setWeapon(weapon);
        return clonedCharacter;
    }
}
