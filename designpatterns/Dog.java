package designpatterns;

/**
 * Created by nxc141130 on 10/9/16.
 */
public class Dog  extends Animal{

    public void digHole(){
        System.out.println("Dug a hole");
    }
    public Dog(){
        super();
        setSound("bark");
    }
    // can not be accessed outside the class : even fido can't call it
    private void bePrivate(){
        System.out.println("I am a private mehtod");

    }

    // we can however access the private method within a subclass from it;s public method.
    // but what is the point to keep it private when anybody can access it from the outside

    public void accessPrivate(){
        bePrivate();
    }

}
