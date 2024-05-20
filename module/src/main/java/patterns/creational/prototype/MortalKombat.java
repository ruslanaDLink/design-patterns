package patterns.creational.prototype;

import patterns.creational.prototype.characters.Kitana;

public class MortalKombat {

    public static void main(String[] args) throws CloneNotSupportedException {
        Character kitana = new Kitana();
        Character clonedKitana = kitana.clone();

        clonedKitana.fight();
        clonedKitana.fight();
        clonedKitana.fight();

        overallScore(clonedKitana);

        clonedKitana.reset();
    }

    public static void overallScore(Character character) {
        System.out.println(character.name + "\nWINS: " + character.getWins() +
                "\t" + "LOSES: " + character.getLoses() +
                "\t" + "DRAWBACKS: " + character.getDrawbacks());
    }
}
