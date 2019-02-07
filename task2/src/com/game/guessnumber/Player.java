//package com.game.guessnumber;
//
//import java.util.Scanner;
//
//public class Player {
//
//    private String name;
//
//    public Player(String name){
//        this.name = name;
//    }
//    public int guessNumber(){
//        Scanner sc = new Scanner(System.in);
//
//        Game.printMessage(View.INPUT_INT_DATA);
//        while( ! sc.hasNextInt()) {
//            Game.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
//            sc.next();
//        }
//        return sc.nextInt();
//    }
//
//
//}
