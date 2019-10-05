package com.generics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String imie,nazwisko;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź imię: ");
        imie = scanner.next();

        System.out.println("Wprowadzono: " + imie);

        nazwisko = scanner.next();

        System.out.println("Wprowadzono: " + nazwisko);

        System.out.println("_____________________");
        System.out.println("Imie:"+imie);
        System.out.println("Kolejna linia");
        System.out.println("_____________________");
    }
}
