package pl.dmhelper.domain.dice;

import java.util.Random;

/**
 * The class {@code Dice} represents single roll of a dice
 *
 * @author Jakub D. Graczyk
 * @since 0.1
 */
public class Dice {
    /**
     * The {@code roll} contains roll value of a single dice
     */
    private final int roll;
    /**
     * The {@code bonus} contains bonus added to the roll,
     * kept separately for ease of printing
     */
    private final int bonus;

    /**
     * Returns sum of {@code Dice} roll and bonus variables
     *
     * @return sum of dice roll and it's bonus
     */
    private int result(){
        return roll+bonus;
    }

    /**
     * Constructor that acts like a dice
     *
     * @param roll roll value of a single dice
     * @param bonus bonus value of a single dice
     */
    public Dice(int roll, int bonus) {
        Random rand = new Random();
        this.roll = 1 + rand.nextInt(roll);
        this.bonus = bonus;
    }

    /**
     * Returns roll value from {@code Dice}
     *
     * @return roll value
     */
    public int getRoll() {
        return roll;
    }

    /**
     * Returns bonus value from {@code Dice}
     *
     * @return bonus value
     */
    public int getBonus() {
        return bonus;
    }
}
