package com.luv2code.samplePractice.DesignPatterns;

public class SingletonDesignPatterns {

    private SingletonDesignPatterns() {
    }

    // Eager Initialization
    //it has draw back that it will create instance even if you are not using it
/*


    private static final SingletonDesignPatterns instance =new SingletonDesignPatterns();

public static SingletonDesignPatterns getInstance() {
        return instance;
    }

    */


    //Static block initialization
    //Both eager initialization and static block initialization creates the instance
    // even before it’s being used and that is not the best practice to use

   /* private static SingletonDesignPatterns instance;

    static {
        try{
            instance =new SingletonDesignPatterns();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static SingletonDesignPatterns getInstance() {
        return instance;
    }
**/


    //Lazy Initialization
    //works fine in case of the single-threaded environment but when it comes to multithreaded systems,
    // it can cause issues if multiple threads

    /*private static SingletonDesignPatterns instance;

    public static SingletonDesignPatterns getInstance(){
        if(instance == null){
            instance = new SingletonDesignPatterns();
        }
        return instance;
    }

     */

    // Thread Safe Singleton
    //Above implementation works fine and provides thread-safety but it reduces the performance
/*
    private static SingletonDesignPatterns instance;

    public static synchronized  SingletonDesignPatterns getInstance(){
        if(instance == null){
            instance = new SingletonDesignPatterns();
        }
        return instance;
    }

 */

    //Bill Pugh Singleton Implementation
    //Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded,
    // SingletonHelper class is not loaded into memory and only when someone calls the getInstance method,
    private static SingletonDesignPatterns instance;

    private static class SingletonHelper{
        private static final SingletonDesignPatterns INSTANCE = new SingletonDesignPatterns();
    }

    public static synchronized  SingletonDesignPatterns getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
