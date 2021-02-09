package com.company;

public class Main {

    public static void main(String[] args) {

        //NotThreadSafeSingletonClass.getMyUniqueInstance("Main Thread 1");

        (new Thread(new MyRunnableClass("Thread 1"))).start();
        (new Thread(new MyRunnableClass("Thread 2"))).start();
        (new Thread(new MyRunnableClass("Thread 3"))).start();
        (new Thread(new MyRunnableClass("Thread 4"))).start();
        (new Thread(new MyRunnableClass("Thread 5"))).start();

        //NotThreadSafeSingletonClass.getMyUniqueInstance("Main Thread 2");

    }
}
