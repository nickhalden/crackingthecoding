import java.util.*;
import java.lang.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by other on 11/28/17.
 */
public class RandomMain {

    public static void main(String[] args) {
        System.out.println("Printing from the main class");


        //Adding pizza to an oven queue
        Queue<Pizza> oven= new LinkedList<>();

        Pizza p1 = new Pizza("Large");
        Pizza p2= new Pizza("Small");
        Pizza p3 = new Pizza("ExtraSmall");

        oven.add(p1);
        oven.add(p2);
        oven.add(p3);


        Random random  = new Random();


        while (!oven.isEmpty()) {
            try {
                int wait = random.nextInt(5);    //random wait time and poll the pizza out of the queue

                System.out.println(wait);
                Thread.sleep(wait);
                Pizza p= oven.poll();

                System.out.println(p.getType());


            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }





    }
}


// class to server pizza properties


class Pizza {

    private String Type;
    Pizza(String Type){
        this.Type=Type;
    }

    public String getType(){

        return this.Type;
    }
}
