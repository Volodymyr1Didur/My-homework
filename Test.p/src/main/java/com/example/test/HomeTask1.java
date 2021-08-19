package com.example.test;

public class HomeTask1 {
    public static void main(String args[]){
        Model model=new Model();
        View view=new View();
        Controller controller= new Controller(model, view);

        controller.getProcess();
    }
}
