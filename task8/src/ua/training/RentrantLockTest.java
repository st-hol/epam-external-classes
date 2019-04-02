package ua.training;

import java.util.concurrent.locks.ReentrantLock;

public class RentrantLockTest {

    public static void main(String[] args) {

        CommonRes commonResource= new CommonRes();
        ReentrantLock locker = new ReentrantLock(); // ??????? ????????
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThr(commonResource, locker));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonRes{

    int x=0;
}

class CountThr implements Runnable{

    CommonRes res;
    ReentrantLock locker;
    CountThr(CommonRes res, ReentrantLock lock){
        this.res=res;
        locker = lock;
    }
    public void run(){

        locker.lock(); // ????????????? ??????????
        try{
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock(); // ??????? ??????????
        }
    }
}




//import java.util.concurrent.locks.ReentrantLock;
//import java.util.concurrent.locks.Condition;
//
//public class Program {
//
//    public static void main(String[] args) {
//
//        Store store=new Store();
//        Producer producer = new Producer(store);
//        Consumer consumer = new Consumer(store);
//        new Thread(producer).start();
//        new Thread(consumer).start();
//    }
//}
//// ????? ???????, ???????? ????????????? ??????
//class Store{
//    private int product=0;
//    ReentrantLock locker;
//    Condition condition;
//
//    Store(){
//        locker = new ReentrantLock(); // ??????? ??????????
//        condition = locker.newCondition(); // ???????? ???????, ????????? ? ???????????
//    }
//
//    public void get() {
//
//        locker.lock();
//        try{
//            // ???? ??? ????????? ??????? ?? ??????, ???????
//            while (product<1)
//                condition.await();
//
//            product--;
//            System.out.println("?????????? ????? 1 ?????");
//            System.out.println("??????? ?? ??????: " + product);
//
//            // ?????????????
//            condition.signalAll();
//        }
//        catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }
//        finally{
//            locker.unlock();
//        }
//    }
//    public void put() {
//
//        locker.lock();
//        try{
//            // ???? ?? ?????? 3 ??????, ???? ???????????? ?????
//            while (product>=3)
//                condition.await();
//
//            product++;
//            System.out.println("????????????? ??????? 1 ?????");
//            System.out.println("??????? ?? ??????: " + product);
//            // ?????????????
//            condition.signalAll();
//        }
//        catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }
//        finally{
//            locker.unlock();
//        }
//    }
//}
//// ????? ?????????????
//class Producer implements Runnable{
//
//    Store store;
//    Producer(Store store){
//        this.store=store;
//    }
//    public void run(){
//        for (int i = 1; i < 6; i++) {
//            store.put();
//        }
//    }
//}
//// ????? ???????????
//class Consumer implements Runnable{
//
//    Store store;
//    Consumer(Store store){
//        this.store=store;
//    }
//    public void run(){
//        for (int i = 1; i < 6; i++) {
//            store.get();
//        }
//    }
//}