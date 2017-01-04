import java.util.Scanner;
import java.util.Stack;

/**
 * Created by vn0dht3 on 1/2/17.
 */
public class PairProgrammingHackerank {
}


// This is the text editor interface.
// Anything you type or change here will be seen by the other person in real time.
class PairMain{
    public static void main(String args[]){
        System.out.println("Hello World");
        Scanner scanner= new Scanner(System.in);
        String number=scanner.nextLine();
        System.out.println("Number is: "+ number);
        Stack<Integer> stack= new Stack<>();
        while (scanner.hasNext()){
            stack.push(scanner.nextInt());

        }
        //Stack<Integer>
        System.out.println(stack);
    }
    public static void solution(){

    }
}