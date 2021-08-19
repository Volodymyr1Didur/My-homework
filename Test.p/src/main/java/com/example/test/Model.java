package com.example.test;
import java.util.Arrays;


public class Model {
    private String[] ar = {"", ""};

    public boolean getSituation(){
        if(ar[1].equals("world!") && ar[0].equals("Helloy")){
            return true;
        }
        else{
            return false;
        }
    }

    public void addWord(String word){
        if(word.equals("Helloy")){
            ar[0]="Helloy";
        }
        else{
            ar[1]="world!";
        }
    }
    public String finalStep(){
        return "Helloy world!";
    }


}
