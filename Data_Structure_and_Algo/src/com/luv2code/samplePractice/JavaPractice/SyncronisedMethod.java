package com.luv2code.samplePractice.JavaPractice;

public class SyncronisedMethod implements  Runnable {
    public static void main(String ar[]) {
        SyncronisedMethod syncronisedMethod = new SyncronisedMethod();
        Thread thread1 = new Thread(syncronisedMethod,"Thread 1");
        Thread thread2 = new Thread(syncronisedMethod,"Thread 2");
        thread1.start();
        thread2.start();
    }

    public synchronized  void printValue()
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                //here wait is relesing the lock for that particular time
                wait(10000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void run() {
        printValue();
    }
}
