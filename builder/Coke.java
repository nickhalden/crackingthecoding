package builder;

/**
 * Created by vn0dht3 on 1/15/17.
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Cold Drink";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
