package com.swiggy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for player 1
        System.out.println("Enter attributes for Player 1:");
        System.out.print("Health: ");
        int p1Health = scanner.nextInt();
        System.out.print("Attack: ");
        int p1Attack = scanner.nextInt();
        System.out.print("Defense: ");
        int p1Defense = scanner.nextInt();

        //  Instantiatng player 1
        Player player1 = new Player(p1Health, p1Attack, p1Defense);

        // Taking input for player 2
        System.out.println("Enter attributes for Player 2:");
        System.out.print("Health: ");
        int p2Health = scanner.nextInt();
        System.out.print("Attack: ");
        int p2Attack = scanner.nextInt();
        System.out.print("Defense: ");
        int p2Defense = scanner.nextInt();

        //  Instantiatng player 2
        Player player2 = new Player(p2Health, p2Attack, p2Defense);

        // Waiting for user to press Enter to start the game
        System.out.println("Press ENTER to begin the fight...");
        // Consuming the newline character
        scanner.nextLine();
        // Waiting for Enter key press
        scanner.nextLine();

        scanner.close();

        // Instantiating the Magical Arena
        MagicalArena arena = new MagicalArena(player1, player2);

        // Starting the fight
        arena.fight();
    }
}
