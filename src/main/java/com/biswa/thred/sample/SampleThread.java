package com.biswa.thred.sample;

/**
 * This is sample Thread class to demonstrate How the Thread runs in Java/
 * In this Tutorial I will cover the basic of Java Thread extends

 */
public class SampleThread {

    public static void main(String[] args){
        ThreadRunner runner1 = new ThreadRunner();
        runner1.start();

        ThreadRunner runner2 = new ThreadRunner();
        runner2.start();
    }
}

/**
 * Thread Runner class to implement the Thread code
 */
class ThreadRunner extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Running:: " +i);
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
