package pl.dmhelper;

import pl.dmhelper.domain.dice.DiceManager;
import pl.dmhelper.domain.dice.DiceService;
import pl.dmhelper.ui.text.TextMainView;

public class DMHelperApp {

    public static void main(String[] args) {

        DiceManager diceManager=new DiceManager();
        DiceService diceService=new DiceService(diceManager);
        TextMainView view = new TextMainView(diceService );

        view.init();
    }
}