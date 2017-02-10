package builder;

/**
 * Created by vn0dht3 on 1/15/17.
 */
public interface Item {

    public String name();

    // every item that we need to create must be packed
    //
    public Packing packing();

    public float price();

}
