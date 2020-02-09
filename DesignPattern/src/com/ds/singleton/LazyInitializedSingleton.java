package com.ds.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){ //add synchronized keyword for thread-safe singleton eg.
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
