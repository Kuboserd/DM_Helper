package pl.dmhelper;

import pl.dmhelper.domain.dice.DiceManager;

public class DMHelperApp {
    public DMHelperApp() {
    }

    public static void main(String[] args) {
        System.out.println("DMHelper - Aplication which will make your Dming much more easier!");
        DiceManager master = new DiceManager();
        master.createNewDice("2d5+8");
        master.createNewDice("2d5+8");
        master.createNewDice("3d6+2");
        master.createNewDice("2d5+8");
        master.createNewDice("3d6+2");
        master.createNewDice("3d6+2");
        System.out.println("Test");
        master.printDiceRolls();
    }
}