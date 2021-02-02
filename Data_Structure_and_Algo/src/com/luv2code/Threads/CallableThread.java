package com.luv2code.Threads;

import java.util.concurrent.Callable;

public class CallableThread {
    public static void main(String ar[]) throws Exception {
       String threadName= task.call();
        System.out.println("ThreadName--->"+threadName);


    }

    static Callable<String> task = ()->{
        String threadName = Thread.currentThread().getName();
        System.out.println("welcome->>>" + threadName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return threadName;
    };
}
