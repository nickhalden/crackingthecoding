package Singleton;

/**
 * Created by vn0dht3 on 1/15/17.
 */
public class SingletonObject {
    // create a singleton object (the one and only)

    private static SingletonObject singletonObject= new SingletonObject();

    //make the constructor private for no access
    // of class outside throught this constructor
    private SingletonObject(){

    }

    // create a public getInstance method allowing
    // the access of Singleton object from outside

    public  static  SingletonObject getInstance(){
        return singletonObject;
    }

    public void print(){
        System.out.println("Hello");
    }

}
