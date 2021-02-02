package com.luv2code.Threads;

public class Java8Concurrency {

    public static void main(String ar[]) {
        task.run();
        Thread thread = new Thread(task);
        thread.setName("First_Thread");
        thread.start();

    }

    static Runnable task = () -> {
        String threadName = Thread.currentThread().getName();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("welcome->>>" + threadName);

    };
}
