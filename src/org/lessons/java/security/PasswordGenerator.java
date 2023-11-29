package org.lessons.java.security;


import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String name = input.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        String surname = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito: ");
        String colour = input.nextLine();

        System.out.print("Inserisci la tua data di nascita: ");
        String birth = input.nextLine();

        String total = name + " " + surname + " " + colour + " " + birth;
        System.out.println(total);




    }
}

