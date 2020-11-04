package pl.dmhelper.domain.dice;

import java.util.ArrayList;

public class DiceService {

    private final DiceManager diceManager;

    public DiceService(DiceManager dm){
        this.diceManager =dm;
    }
    public ArrayList<Dice> createNewDice(String s){
        return this.diceManager.createNewDice(s);
    }
    public void printAll(){
        this.diceManager.printDiceRolls();
    }
}
