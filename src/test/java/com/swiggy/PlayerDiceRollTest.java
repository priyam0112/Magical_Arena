package com.swiggy;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PlayerDiceRollTest {
    
    @Test
    public void AttackingDiceRollValueTest() {
        // Instantiating the player, who is attacker for a given round
        Player attacker = new Player(99, 17, 10);

        // Initialising the attacker dice roll
        int attackingDiceRoll = attacker.attack();

        // Enforcing a test that attacker's dice roll value should be between 1 and 6, both inclusive 
        assertTrue("Attack roll should be between 1 and 6", attackingDiceRoll >= 1 && attackingDiceRoll <= 6);  
    }
    
    @Test
    public void DefendingDiceRollValueTest() {
        // Instantiating the player, who is defender for a given round
        Player defender = new Player(90, 16, 8);

        // Initialising the defender dice roll
        int defendingDiceRoll = defender.defend();

        // Enforcing a test that defender's dice roll value should be between 1 and 6, both inclusive 
        assertTrue("Defense roll should be between 1 and 6", defendingDiceRoll >= 1 && defendingDiceRoll <= 6);
    }
}