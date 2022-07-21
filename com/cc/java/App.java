package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Konto konto1 = new Konto();
        System.out.println("Start " + konto1.getKontostand());
        konto1.verdopplung();
        System.out.println("Aktuell " + konto1.getKontostand());
        output("");

        Konto konto2 = new Konto();
        System.out.println("Start " + konto2.getKontostand());
        konto2.verdreifachung();
        System.out.println("Aktuell " + konto2.getKontostand());
        output("");
        
        Konto konto3 = new Konto();
        System.out.println("Start " + konto3.getKontostand());        
        konto3.verzehnfachung();
        System.out.println("Aktuell " + konto3.getKontostand());
        output("");
        
        output(String.valueOf(konto2.getKontostand()));
        
    }  
    
    private static void output(String inputStr) {

        System.out.println(inputStr);
     
    }

}

