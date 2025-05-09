package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    public static String promptForValidName(Scanner scanner, String playerLabel) {
        while (true) {
            System.out.print("Enter name for " + playerLabel + ": ");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                return name;
            }
            System.out.println("Name cannot be empty. Please try again.");
        }
    }
}