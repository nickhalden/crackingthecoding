package designpatterns;

/**
 * Created by nxc141130 on 10/9/16.
 */
public class Giraffe  extends Creature{

    private String name;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String newName) {
        name=newName;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double newWeight) {

    }

    @Override
    public void someTest() {
        super.someTest();// initialises the abstract variables if any

    }
}
