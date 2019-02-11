package com.game.guessnumber;

import org.junit.Assert;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class OpponentTest {

    public Opponent opponent; // Model
    public StatusChecker checker; // View
    public Game game; // Controller

    @BeforeClass
    public static void start(){
        Opponent opponent = new Opponent("Computer");
        StatusChecker checker = new StatusChecker();
        Game game = new Game(opponent, checker);
    }

    @org.junit.Test
    public void rand() {
        int i = 0;
        int tmpRand;
        while (i != 10_000){
            tmpRand = Opponent.rand();

            if (tmpRand > Opponent.RAND_MAX || tmpRand < Opponent.RAND_MIN){
                Assert.fail();
            }
        i++;
        }
    }


}