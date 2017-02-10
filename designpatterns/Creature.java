package designpatterns;

/**
 * Created by nxc141130 on 10/9/16.
 */

// 1)cannot create object of the abstract class
// 2)if you want people block  from using it (i.e objects)
// 3) subclasses can still extend it, otherwise it would be completely worthless
// 4) protected fields are like private fields except that subclasses can inherit from it
    //forces users to do things this way
abstract  public class Creature {

    protected String name;
    protected int weight;
    protected String sound;

    //every method must be declared as abstract
    // abstract methods cannot have a body
    public abstract String getName();
    public abstract void setName(String newName);
    public abstract double getWeight();
    public abstract void setWeight(double newWeight);

    // do a documentation that I can have  non-abstract methods
    public void someTest(){
            System.out.println("Abstract Creature ");
    }

}
