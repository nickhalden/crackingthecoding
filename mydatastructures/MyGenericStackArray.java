package mydatastructures;

import java.util.Iterator;

/**
 * Created by vn0dht3 on 1/4/17.
 */

// use the previous array code to make it generic or do it by yourself by implementing the iterator method



public class MyGenericStackArray<Anytype> implements Iterable<Anytype> {

    Anytype stack[]=(Anytype[]) new Object[10];

    @Override
    public Iterator<Anytype> iterator() {
        return null;
    }

    public void push(Anytype element){

    }

    public Anytype peek(){

        return null;
    }

    public Anytype pop(){

        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
