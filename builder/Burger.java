package builder;

/**
 * Created by vn0dht3 on 1/15/17.
 */
public abstract  class Burger implements Item{

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();

}


