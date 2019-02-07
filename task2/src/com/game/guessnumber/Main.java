package com.game.guessnumber;

public class Main {

    public static void main(String[] args) {
        //Init.
        Opponent opponent = new Opponent("Computer"); //Model
        Game game = new Game(opponent); //Controller
        //process
        game.playGame();
    }
}
