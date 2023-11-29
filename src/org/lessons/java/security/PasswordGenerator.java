package org.lessons.java.security;


import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //CHIEDO GLI INPUT ALL'UTENTE
        System.out.println("Inserisci il tuo nome: ");
        String name = input.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        String surname = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito: ");
        String colour = input.nextLine();

        //CHIEDO IL GIORNO IL MESE E L'ANNO SEPARATAMENTE
        System.out.print("Inserisci il giorno in cui sei nato/a: ");
        int dayBirth = input.nextInt();

        System.out.print("Inserisci il mese in cui sei nato/a: ");
        int monthBirth = input.nextInt();

        System.out.print("Inserisci l'anno in cui sei nato/a: ");
        int yearBirth = input.nextInt();



        String total = name + " " + surname + " " + colour + " " + dayBirth + " " + monthBirth + " " + yearBirth ;
        System.out.println(total);

        //LI SOMMO
        int sum = dayBirth + monthBirth + yearBirth;

        //STAMPO LA PASSWORD GENERATA
        System.out.println("La tua password generata è: " + name + "-" + surname + "-" + colour + "-" + sum);







    }
}

