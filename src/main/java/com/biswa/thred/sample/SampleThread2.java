package com.biswa.thred.sample;

public class SampleThread2 {

    public static void main(String[] args){
        Thread t1 = new Thread(new ThreadRunner1());
        Thread t2 = new Thread(new ThreadRunner1());
        Thread t3 = new Thread(new ThreadRunner1());
        Thread t4 = new Thread(new ThreadRunner1());


        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}

/**
 * Demo Class to implement the Runnable interface. The overridden
 * Run Method
 */
class ThreadRunner1 implements Runnable{
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Running:: " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
