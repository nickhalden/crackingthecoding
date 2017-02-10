package designpatterns;

/**
 * Created by nxc141130 on 10/9/16.
 */

//Description:
// Main class to work with Animal, Dog and Cat

public class WorkWithAnimals {

    int justANum=10; // static method can't iuse non-static variables or method in static

    public static void main(String[] args) {
        Dog fido= new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-19);

        // chgange the object properties through reference
        changeDogName(fido);
        System.out.println("the changed name is "+fido.getName());
        // refer subclass by there superclass type Animal doggy= new Dog()
        // but we cant access methods this way if they are onlt in the subclass though
        // this won't doggy.getHole() as the animal class does not know about the method in the subclass
        // that is where we would need abstraction and interfaces
        Animal doggy= new Dog();

        Animal kitty= new Cat();

        System.out.println("doggy says: "+doggy.getSound());
        System.out.println("kitty says: "+kitty.getSound());


        //create an arry of objects // animal array
        Animal[] animals= new Animal[4];
        animals[0]=doggy;
        animals[1]=kitty;
        System.out.println("doggy says: "+animals[0].getSound());
        System.out.println("kitty says: "+animals[1].getSound());

        // we can pass any object and it still calls the right method still
        speakAnimal(doggy); // can be called without the object because it is static

        ((Dog)doggy).digHole();

        // System.out.println(justANum); Error: non static field/instance  can't be referred from a tatic context

        //
        //hello(); //cannot call the non static reference method

        // cannot access the private method
        //fido.bePrivate()
        fido.accessPrivate(); // no point in doign so; just for the illustration

        // abstract
        Giraffe giraffe= new Giraffe();
        giraffe.setName("frank");

        System.out.println(giraffe.getName());

        Monkey monkey=new Monkey();
        monkey.setName("Alfred");

        System.out.println(monkey.getName());

    }
    //Static means: every object (this is ever created) related to this class would have some static variables/methods related to it
    public static void changeDogName(Dog fido){
        fido.setName("Marcus");
    }
    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says : "+randAnimal.getSound());
    }

    public  void hello(){

    }
}


