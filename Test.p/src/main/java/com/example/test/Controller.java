package com.example.test;

import java.util.Scanner;
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }
    public void getProcess(){
        while(!model.getSituation()) {
            Scanner sc = new Scanner(System.in);

            model.addWord(ckeckWord(sc));
        }
        view.printMessage(model.finalStep());
    }
    public String ckeckWord(Scanner sc){
        view.printMessage(View.INPUT_STRING_DATA);
        while(!sc.nextLine().equals("Helloy") || !sc.nextLine().equals("world!")){
            view.printMessage(View.WRONG_INPUT_STRING_DATA + View.INPUT_STRING_DATA);
            sc.next();
        }
        view.printMessage(View.Ok);
        if(sc.nextLine().equals("Helloy")){ return "Helloy";}
        else{ return "world!";}
    }
}
