package com.swiggy;
import java.util.Random;

public class Player {
// Defining 3 attributes of for each Player along with a  Random class object to simulate Dice throw 
    int health;
	int strength;
	int attack;
	Random dice;

// Initialising the player
    public Player(int health, int strength, int attack) {
		this.health = health;
		this.strength = strength;
		this.attack = attack;
		this.dice = new Random();
	}

    // To terminate the game ,to be accessed in the GameArena for each round , for the defending player
	boolean isAlive() {
		return health > 0;
	}

    // To simulate attacking dice roll, generates a multiplier between 1 to 6, to be accessed in the GameArena
	int attack() {
		int multiplier=dice.nextInt(6)+1;
		return multiplier; 
	}

    // To simulate defending dice roll, generates a multiplier between 1 to 6, to be accessed in the GameArena
	int defend() {
		int multiplier=dice.nextInt(6)+1;
		return multiplier;
	}
    
    // To simulate the actual damage to the player when defending, to be accessed in the GameArena
	void inflictDamage(int damage) {
		health -= damage;		
	}

}