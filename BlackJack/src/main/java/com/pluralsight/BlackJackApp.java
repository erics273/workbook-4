package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = UserInterface.promptForValidName(scanner, "Player 1");
        Player player1 = new Player(name1);

        String name2 = UserInterface.promptForValidName(scanner, "Player 2");
        Player player2 = new Player(name2);

        Deck deck = new Deck();
        deck.shuffle();

        // Deal 2 cards to each player
        for (int i = 0; i < 2; i++) {
            Card card1 = deck.deal();
            player1.getHand().deal(card1);
            Card card2 = deck.deal();
            player2.getHand().deal(card2);
        }


        // Determine winner
        int score1 = player1.getScore();
        int score2 = player2.getScore();

        if ((score1 > score2 && score1 <= 21) || (score1 <= 21 && score2 > 21)) {
            System.out.println(player1.getName() + " wins!");
        } else if ((score2 > score1 && score2 <= 21) || (score2 <= 21 && score1 > 21)) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
