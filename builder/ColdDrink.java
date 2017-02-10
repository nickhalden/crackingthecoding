package builder;

/**
 * Created by vn0dht3 on 1/15/17.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
