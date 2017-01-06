import java.util.Scanner;
import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;
public class CodePad{
    public static void main(String args[]){
        ArrayList<Integer> arrayList= new ArrayList<>();
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