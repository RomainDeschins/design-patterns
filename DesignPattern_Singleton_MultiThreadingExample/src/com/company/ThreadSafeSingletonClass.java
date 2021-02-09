package com.company;

public class ThreadSafeSingletonClass {

    private static ThreadSafeSingletonClass ThreadSafeSingletonInstance;

    private ThreadSafeSingletonClass(String threadName) {
        System.out.println(threadName + " created a Singleton Object from the thread safe singleton class");
    }

    public static synchronized ThreadSafeSingletonClass getMyUniqueInstance(String threadName){
        if (ThreadSafeSingletonInstance == null){
            ThreadSafeSingletonInstance = new ThreadSafeSingletonClass(threadName);
        } else {
            System.out.println(threadName +  " could not create an instance of the thread safe singleton class");
        }
        return ThreadSafeSingletonInstance;
    }


}
