package pl.dmhelper.domain.dice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class {@code DiceManager} is responsible for every
 * logic made on the class {@code Dice}.
 *
 * @author Jakub D. Graczyk
 * @since 0.1
 */
public class DiceManager {
    /**
     * Variable which keeps depth of 2d ArrayList
     */
    private static int vertexCount=0;
    /**
     * The {@code diceRolls} ArrayList keeps all the rolls and keeps them in series.
     */
    ArrayList<ArrayList<Dice>> diceRolls = new ArrayList<>();

    /**
     * Creates new {@code Dice}, prints dice values and adds it to the {@code diceRolls} Array.
     *
     * @param s String in specific format aquired by passing
     *         it through {@link #prepareString}.
     */
    protected ArrayList<Dice> createNewDice(String s){
        s = this.prepareString(s);
        Scanner in = new Scanner(s);
        int diceAmount = in.nextInt();
        int diceType = in.nextInt();
        int diceBonus = in.nextInt();
        diceRolls.add(new ArrayList<>());

        for(int i = 0; i < diceAmount; i++) {
            Dice firstDice = new Dice(diceType,diceBonus);
            System.out.println("Roll nr " + (i+1)+ " of series"+ (vertexCount+1) + ": " + firstDice.toString());
            if (s.endsWith("A")) {
                Dice secondDice = new Dice(diceType,diceBonus);
                System.out.println("Advantage roll nr " + (i+1) + ": " + secondDice.toString());
                if(firstDice.getRoll()>secondDice.getRoll())
                    diceRolls.get(vertexCount).add(firstDice);
                else
                    diceRolls.get(vertexCount).add(secondDice);
            }
            else
                diceRolls.get(vertexCount).add(firstDice);
        }
        vertexCount++;
        System.out.println();
        return diceRolls.get(vertexCount-1);
    }

    /**
     * Prepares {@code String} into readable for {@code createNewDice} String
     *
     * @param s string in format of "(int)d(int)+(int)" for advantage roll
     *         add 'A' to the end of this String
     * @return prepared String
     */
    private String prepareString(String s) {
        s = s.toLowerCase();
        s = s.replace("d", " ");
        s = s.replace("+", " ");
        if (s.contains("a"))
            s = s.replace("a", " a");
        return s.toUpperCase();
    }

    /**
     * Prints all contents of {@code diceRolls} two dimensional Array
     */
    protected void printDiceRolls() {
        if (this.diceRolls.size() == 0)
            System.out.println("Please roll some dice first");
        else {
            for (int i = 0; i < vertexCount; i++) {
                System.out.println("Roll series nr " + (i + 1) + ": ");
                for (Dice n : diceRolls.get(i)) {
                    System.out.println(n.toString());
                }
            }
        }
    }
}