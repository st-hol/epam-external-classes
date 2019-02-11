package com.game.guessnumber;

public class Main {

    public static void main(String[] args) {
        //Init.
        Opponent opponent = new Opponent("Computer"); // Model
        StatusChecker checker = new StatusChecker(); // View
        Game game = new Game(opponent, checker); // Controller
        //process
        game.startGame();
    }
}
