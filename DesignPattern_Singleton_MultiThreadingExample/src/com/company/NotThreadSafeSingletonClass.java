package com.company;

public class NotThreadSafeSingletonClass {

    private static NotThreadSafeSingletonClass notThreadSafeSingletonInstance;

    private NotThreadSafeSingletonClass(String threadName) {
        System.out.println(threadName + " created an instance of the NOT thread safe singleton class");
    }

    public static NotThreadSafeSingletonClass getMyUniqueInstance(String threadName){
        if (notThreadSafeSingletonInstance == null){
            notThreadSafeSingletonInstance = new NotThreadSafeSingletonClass(threadName);
        } else{
            System.out.println(threadName +  " could not create an instance of the NOT thread safe singleton class");
        }
        return notThreadSafeSingletonInstance;
    }


}
