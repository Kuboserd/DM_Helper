package pl.dmhelper.ui.text;

import pl.dmhelper.domain.dice.DiceService;

import java.util.Scanner;

public class TextMainView {

    DiceService diceService;

    public TextMainView(DiceService ds){
        this.diceService=ds;
    }

    public void init(){
        System.out.println("DMHelper - Aplication which will make your Dming much more easier!");

        System.out.println("Menu:");
        Scanner in = new Scanner(System.in);
        int option =-1;

        while(option!=0){
            System.out.println("2.Show rolls");
            System.out.println("1.Roll");
            System.out.println("0.Exit");
            option=Integer.parseInt(in.nextLine());
            if(option==1){
                handleCreateDice(in);
            }else if(option==0){
                System.out.println("Exiting program.");
            }else if(option==2){
                diceService.printAll();
            }
        }
    }

    private void handleCreateDice(Scanner scanner){
        System.out.println("Enter your dice roll. Example: \"2d6+4\" add 'A' for a roll with an advantage");
        this.diceService.createNewDice(scanner.nextLine());
    }
}
