package ua.training;

import java.util.concurrent.Phaser;

public class PhaserTest {

    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread 2")).start();

        // ???? ?????????? ???? 0
        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("???? " + phase + " ?????????");
        // ???? ?????????? ???? 1
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("???? " + phase + " ?????????");

        // ???? ?????????? ???? 2
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("???? " + phase + " ?????????");

        phaser.arriveAndDeregister();
    }
}

class PhaseThread implements Runnable{

    Phaser phaser;
    String name;

    PhaseThread(Phaser p, String n){

        this.phaser=p;
        this.name=n;
        phaser.register();
    }
    public void run(){

        System.out.println(name + " ????????? ???? " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // ????????, ??? ?????? ???? ??????????

        System.out.println(name + " ????????? ???? " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // ????????, ??? ?????? ???? ??????????

        System.out.println(name + " ????????? ???? " + phaser.getPhase());
        phaser.arriveAndDeregister(); // ???????? ? ?????????? ??? ? ??????? ? ??????????? ???????
    }
}