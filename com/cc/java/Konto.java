package com.cc.java;

// import javax.lang.model.element.VariableElement;

public class Konto {
    
    private int kontostand = 10000;
    // public static String input;

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public void verdopplung() {
        setKontostand(kontostand*2);
    }

    public void verdreifachung() {
        setKontostand(kontostand*3);
    }

    public void verzehnfachung() {
        setKontostand(kontostand*10);
    }


    // Überladene Methoden haben eine andere Syntax

    // public static void ausgabe(int i) {
    //     System.out.println(i);
    // }  

    // public static void ausgabe(String i) {
    //     System.out.println(i);
    // }   

}
