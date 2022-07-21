package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        String start = "Start ";
        String aktuell = "Aktuell ";

        Konto konto1 = new Konto();
        System.out.println(start + konto1.getKontostand());
        konto1.verdopplung();
        System.out.println(aktuell + konto1.getKontostand());
        output("");

        Konto konto2 = new Konto();
        System.out.println(start + konto2.getKontostand());
        konto2.verdreifachung();
        System.out.println(aktuell + konto2.getKontostand());
        output("");
        
        Konto konto3 = new Konto();
        output(start + konto3.getKontostand());        
        konto3.verzehnfachung();
        output(aktuell + konto3.getKontostand());
        output("");

        output(String.valueOf(2));
        output(Integer.toString(2));
    }  

    private static void output(String inputStr) {

        System.out.println(inputStr);
     
    }

}

