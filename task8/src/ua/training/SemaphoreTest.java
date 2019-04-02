package ua.training;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1); // 1 ??????????
        CommonResrc res = new CommonResrc();
        new Thread(new CountThrd(res, sem, "CountThread 1")).start();
        new Thread(new CountThrd(res, sem, "CountThread 2")).start();
        new Thread(new CountThrd(res, sem, "CountThread 3")).start();
    }
}

class CommonResrc{

    int x=0;
}

class CountThrd implements Runnable{

    CommonResrc res;
    Semaphore sem;
    String name;

    CountThrd(CommonResrc res, Semaphore sem, String name){
        this.res=res;
        this.sem=sem;
        this.name=name;
    }

    public void run(){

        try{
            System.out.println(name + " ??????? ??????????");
            sem.acquire();
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println(name + " ??????????? ??????????");
        sem.release();
    }
}