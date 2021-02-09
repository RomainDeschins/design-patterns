package com.company;

public class MyRunnableClass implements Runnable{

    String threadName= null;

    public MyRunnableClass(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        NotThreadSafeSingletonClass.getMyUniqueInstance(threadName);
        ThreadSafeSingletonClass.getMyUniqueInstance(threadName);
    }
}
