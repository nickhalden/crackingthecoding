import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Input = new Scanner(System.in);// user input
        String Test_String = Input.nextLine(); // next lines allowed
        String Regex_Pattern="[A-Z]";
        Pattern p = Pattern.compile(Regex_Pattern);  //compile the pattern
        Matcher m = p.matcher(Test_String); // match the pattern with the input string Matcher class

        while(m.find()){
            System.out.println("group is "+m.group());
        }

        List<String> allMatches = new ArrayList<String>();
        Matcher m1 = Pattern.compile(Regex_Pattern)
                .matcher(Test_String);
        while (m1.find()) {
            allMatches.add(m.group());
        }
        System.out.println(allMatches);
    }
}