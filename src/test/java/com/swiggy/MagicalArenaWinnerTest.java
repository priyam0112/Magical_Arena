package com.swiggy;

import org.junit.Test;
import static org.junit.Assert.assertFalse;


public class MagicalArenaWinnerTest {
    @Test
    public void testFight() {
        // Instantiating the players
        Player player1 = new Player(99, 17, 10);
        Player player2 = new Player(90, 16, 8);

        // Instantiating the Magic Arena 
        MagicalArena arena = new MagicalArena(player1, player2);

        // strating the fight
        arena.fight();

        // Enforcing a test that both players can't be alive at the end of the fight, either one has to be dead
        assertFalse(player1.isAlive() && player2.isAlive());
    }
}
