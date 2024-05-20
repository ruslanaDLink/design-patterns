package patterns.creational.prototype.characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.creational.prototype.Character;

class KitanaTest {

    @Test
    void reset() throws CloneNotSupportedException {
        String errorMessage = "FAILED TO RESET CLONED OBJECT'S VALUES.";

        //given
        Kitana kitana = new Kitana();

        //when
        Character clonedKitana = kitana.clone();
        clonedKitana.fight();
        clonedKitana.fight();
        clonedKitana.fight();

        clonedKitana.reset();
        int drawbacks = clonedKitana.getDrawbacks();
        int wins = clonedKitana.getWins();
        int loses = clonedKitana.getLoses();

        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(0, drawbacks, errorMessage + " Drawback score is higher than 0."),
                () -> Assertions.assertEquals(0, wins, errorMessage + " Win score is higher than 0."),
                () -> Assertions.assertEquals(0, loses, errorMessage + " Lose score is higher than 0.")
        );

    }

    @Test
    void testClone() throws CloneNotSupportedException {
        String errorMessage = "FAILED TO CLONE OBJECT";

        //given
        Kitana original = new Kitana();

        //when
        Character cloned = original.clone();

        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(original.getName(), cloned.getName(), "NAMES ARE DIFFERENT. " + errorMessage),
                () -> Assertions.assertEquals(original.getWeapon(), cloned.getWeapon(), "WEAPONS ARE DIFFERENT. " + errorMessage),
                () -> Assertions.assertEquals(original.getStrength(), cloned.getStrength(), "STRENGTH ARE DIFFERENT. " + errorMessage)
        );

    }
}