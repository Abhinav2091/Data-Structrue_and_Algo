package com.luv2code.Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsThread {
    public static void main(String ar[]) throws ExecutionException, InterruptedException {
        //for runable
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            String threadName = Thread.currentThread().getName();
            System.out.println("welcome->>>" + threadName);
            executorService.shutdown();
        });

        //for callable
        ExecutorService executorCallableService = Executors.newFixedThreadPool(1);
        Future<String > future=executorCallableService.submit(CallableThread.task);

        System.out.println("future done? " + future.isDone());
        String result = future.get();
        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result);
        executorCallableService.shutdown();
    }



}
