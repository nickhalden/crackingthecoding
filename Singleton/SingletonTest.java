package Singleton;

/**
 * Created by vn0dht3 on 1/15/17.
 */
public class SingletonTest {

    // not allowed compiler error
    //SingletonObject object= new SingletonObject(); has private access method

    public static void main(String[] args) {
        SingletonObject singletonObject=SingletonObject.getInstance();
        singletonObject.print();
        System.out.println(singletonObject.hashCode());

        SingletonObject singletonObject2=SingletonObject.getInstance();
        singletonObject2.print();
        System.out.println(singletonObject2.hashCode());

    }


}
