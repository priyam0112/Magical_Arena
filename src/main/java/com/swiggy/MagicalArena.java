package com.swiggy;

public class MagicalArena {
	// Defining two players to simulate the game 
	Player player1;
	Player player2;

	// Initialising the Players for GameArena
	public MagicalArena(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	// Simulating the fight
	void fight() {
		System.out.println("---------- FIGHT STARTS ----------");

		// Choosing attacker and defender at the start of the fight, based on health attribute
		// The player with lesser health value starts the attacker for the intial round, the other once being the defender 
		Player attacker = player1.health < player2.health ? player1 : player2;
		Player defender = attacker == player1 ? player2 : player1;

		System.out.println("Initially, based on health attribute :" );
		System.out.println("Attacker: Player " + (attacker == player1 ? "1" : "2"));
        System.out.println("Defender: Player " + (defender == player1 ? "1" : "2"));
		System.out.println();

		// Logic for fight
		while (player1.isAlive() && player2.isAlive()) {
			// Initialising dice roll values , on spot for the particular round, for both, attacker and defender
			int attackingDiceRoll = attacker.attack();
			int defendingDiceRoll = defender.defend();

			System.out.println("Player " + (attacker  == player1 ? "1" : "2") + " 's  Attack multiplier is : " + attackingDiceRoll);
			System.out.println("Player " + (defender == player1 ? "1" : "2") + " 's  Defense multiplier is : " + defendingDiceRoll);

			// 	Calculating the difference in the damage created by attacker and the damage defended by the defender
			int damage = attackingDiceRoll * attacker.attack - defendingDiceRoll * defender.strength;

			// Checking and inflicting the damage upon the defender, if damage created by attacker which is in excess of the damage defended by the defender
			if (damage > 0) {
				defender.inflictDamage(damage);
				System.out.println("Damage dealt to the Player " + (defender == player1 ? "1" : "2") + " is : " + damage);
			}
			else{
				System.out.println("No Damage dealt to the Player " + (defender == player1 ? "1" : "2"));
			}

			// Swap roles of attacker and defender for the next round, by using a temporaray Player object 
			Player temp = attacker;
			attacker = defender;
			defender = temp;

			// To make output look cleaner giving a line space
			System.out.println();
		}

		// Deciding the winner of the game, based on who is alive at the end of fight
		if (player1.isAlive()) {
			System.out.println("Player 2 Kncocked out , thus, Player 1 wins!");
			System.out.println();
		} else {
			System.out.println("Player 1 Kncocked out , thus, Player 2 wins!");
			System.out.println();
		}
	}
}