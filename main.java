package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("\nUSERNAME GENERATOR v1.1");
        System.out.println("\nPlease input your first name and last name in the format ... Firstname Lastname");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        printAllNames(name);

        System.out.println("\nYour username is: " + getUsername(name));
    }

    private static String getUsername(String name) {
        name = replaceScandinavian(name);
        String[] splittedNames = name.split( " ");
        String firstLetters = splittedNames[0].substring(0, 1);

        String lastName = "";
        if (splittedNames[splittedNames.length - 1].length() > 7)
        lastName = splittedNames[splittedNames.length - 1].substring(0, 7);
        else {
            lastName = splittedNames[splittedNames.length - 1];
        }

        return firstLetters + lastName;
    }

    private static void printAllNames(String name) {
        String[] splittedNames = name.split(" ");

        for (int i = 0; i < splittedNames.length; i++) {
            if ( i == splittedNames.length - 1) {
                System.out.println("Last name: " + splittedNames[i]);
            }
            else {
                System.out.println("First name: " + (i + 1) + ": " + splittedNames[i]);

            }
        }

    }

    private static String replaceScandinavian(String s) {

        s = s.replace('ä','a');
        s = s.replace('Ä','A');
        s = s.replace('å','a');
        s = s.replace('Å','A');
        s = s.replace('ö','o');
        s = s.replace('Ö','O');

        return s;
    }
}
