package patterns.creational.prototype.characters;

import patterns.creational.prototype.Character;
import patterns.creational.prototype.result.FightResult;

import java.util.Map;

public class Kitana extends Character {
    private Map<FightResult, Integer> scores;

    public Kitana() {
        scores = super.getScores();
        name = "KITANA";
        strength = "SUPERHUMAN STRENGTH";
        weapon = "STEEL FANS";
    }

    @Override
    public void reset() {
        scores.clear();
        wins = 0;
        loses = 0;
        drawbacks = 0;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Map<FightResult, Integer> getScores() {
        return scores;
    }

    @Override
    public void setScores(Map<FightResult, Integer> scores) {
        this.scores = scores;
    }
}
