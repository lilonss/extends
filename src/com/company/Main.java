package com.company;

public class Main {

    public static void main(String[] args) {
        Button btn = new Button(new ButtonCopy() {
            @Override
            public void execute() {
                System.out.println("Привет");
            }
        });
        btn.click();

    }
}


interface ButtonCopy {
    void execute();
}

class Button {
    ButtonCopy btnc;

    Button(ButtonCopy btnc) {
        this.btnc = btnc;
    }
    public void click() {
       btnc.execute();
    }
}