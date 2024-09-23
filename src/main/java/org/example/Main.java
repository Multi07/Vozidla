package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        ArrayList<Vozidlo> list = new ArrayList<>();
        list.add(new Auto("zadaná spz","Vyrobce","Audi",1998,4));
        list.add(new Motorka("zadaná spz","Vyrobce","Audi",1998,"dvoutakt"));

        for (Vozidlo vozidlo : list) {
            System.out.println(vozidlo.toString());
        }
    }
}