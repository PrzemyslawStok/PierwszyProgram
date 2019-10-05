package com.generics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String imie,nazwisko;
        int wiek;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź imię: ");
        imie = scanner.next();

        System.out.println("Wprowadzono: " + imie);

        System.out.print("Wprowadź nazwisko: ");
        nazwisko = scanner.next();

        System.out.println("Wprowadzono: " + nazwisko);

        System.out.print("wiek:");
        wiek = Integer.parseInt(scanner.next());


        System.out.println("_____________________");
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Wiek: "+wiek);
        System.out.println("_____________________");
    }
}
