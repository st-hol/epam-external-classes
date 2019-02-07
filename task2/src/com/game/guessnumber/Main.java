package com.game.guessnumber;

public class Main {

    public static void main(String[] args) {
        //Init.
        Player player = new Player("User");
        Opponent opponent = new Opponent("Computer");
        Game game = new Game(player, opponent);
        //process
        game.playGame();
    }
}
