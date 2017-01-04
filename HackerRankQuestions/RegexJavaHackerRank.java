import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vn0dht3 on 12/17/16.
 */
public class RegexJavaHackerRank {


}

// Question: Matching Specific String

class Solution1{

    public static void main(String[] args) {

//        Regex_Website tester = new Regex_Website();
//        tester.checker("hackerank"); //add more options with websites www.google.com google.com abc.google.oom
//
//        Dot dot = new Dot();
////        dot.check("^.{3}\\..{3}\\..{3}\\..{3}$");
//        dot.check("^(.{3}\\.){3}.{3}$"); // anything 3 times followed by a dot and followed by anything of 3
//
        Regex_Date date= new Regex_Date();  //Matching Digits & Non-Digit Characters
        //d defines a digit
        //D defines a non-digit

        date.check("\\d{2}\\D\\d{2}\\D\\d{4}"); // add more options with - ,/,.,, restrict



//        Matching Whitespace & Non-Whitespace Character  matches [ \r\n\t\f ] eg:12 11 15
//        tester.checker("\\S{2}\\s\\S{2}\\s\\S{2}");

        //tester.checker("\\w{1,4}\\W\\w{1,10}\\W\\w{1,3}"); //  Matching Word & Non-Word Characte eg:www.hackerrank.com

       // Matching Start & End
//        tester.checker("^\\d\\w{4}.$"); // Use \\ instead of using \

        //Matching Word Boundaries
        //tester.checker("\\b[aeiouAEIOU][a-zA-Z]*\\b");

        //Capturing & Non-Capturing Groups
        //tester.checker("(ok){3}?");

        //Alternative Matching
        //Given a test string, , write a RegEx that matches  under the following conditions:

        //must start with Mr., Mrs., Ms., Dr. or Er..
        //The rest of the string must contain one or more English alphabetic letters (upper and lowercase).

        //tester.checker("^(M(r|s)s?|Dr|Er)\\.[A-Za-z]+$");

        //Matching Specific Characters
        //tester.checker("^[123][120][xs0][30Aa][xsu][\\.\\,]$");

        //Excluding Specific Characters
        //tester.checker("^[^\\d][^aieou][^bcDF][\\S][^AEIOU][^\\.\\,]$");


        //Matching Character Ranges
        //tester.checker("^[a-z][1-9][^a-z][^A-Z][A-Z]");
        //Matching {x} Repetitions
        //tester.checker("[A-Za-z02468]{40}[\\s13579]{5}$")


        //Matching {x, y} Repetitions

        //Matching Same Text Again & Again
        //tester.checker("^([a-z]\\w\\s\\W\\d\\D[A-Z]\\w[aieouAEIOU]\\S)\\1$"); // Use \\ instead of using \


        //tester.checker("^([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([a-zA-Z])([aeiouAEIOU])(\\S)(\\1)(\\2)(\\3)(\\4)(\\5)(\\6)(\\7)(\\8)(\\9)(\\10)$");














    }

}


class Regex_Website {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);// user input
        String Test_String = Input.nextLine(); // next lines allowed
        Pattern p = Pattern.compile(Regex_Pattern);  //compile the pattern
        Matcher m = p.matcher(Test_String); // match the pattern with the input string Matcher class
        int Count = 0;
        while(m.find()){ // matcher object has the find pointer moving forward and finds until true
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }

}
//////////////////////////////////////////////////////
/////////////////////////////////////////////////////

//Question:Matching Anything But a Newline
//123.456.abc.def
//1123.456.abc.def


class Dot {

    public void check(String pattern){

        Scanner scanner = new Scanner(System.in); //user input
        String testString = scanner.nextLine();  // next lines scanned
        Pattern p = Pattern.compile(pattern);   // compile the patter
        Matcher m = p.matcher(testString);      // matcher object to find the matches
        System.out.print(m);
        boolean match = m.matches();            // if there are matches: true

        System.out.format("%s", match);
    }

}

class Regex_Date {

    public void check(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}