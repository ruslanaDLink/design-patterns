package patterns.creational.prototype.characters;

import patterns.creational.prototype.Character;
import patterns.creational.prototype.result.FightResult;

import java.util.Map;

public class JohnyCage extends Character {
    private Map<FightResult, Integer> scores;

    public JohnyCage() {
        scores = super.getScores();
        name = "JOHNY CAGE";
        strength = "MARTIAL ARTS";
        weapon = "PISTOL";
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void reset() {
        scores.clear();
        wins = 0;
        loses = 0;
        drawbacks = 0;
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
