package bookCracking;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vn0dht3 on 1/2/17.
 */
public class PalindromePumutation {

    public static void main(String[] args) {
        String input1="Taco Coan";

        HashMap<Character,Integer> wordmap= new HashMap();

        for (char c : input1.toLowerCase().toCharArray()){
            if (!wordmap.containsKey(c))
            wordmap.put(c,0);
            else {
                Integer value=wordmap.get(c);
                value++;
                wordmap.put(c,value);
            }
        }

        String input2="taco catk";
        if (input1.length()!=input2.length()) System.out.println("false");
        System.out.println(isPalindrome(wordmap,input2));
    }
    static boolean isPalindrome(HashMap hashMap,String input2){
        for(char c: input2.toLowerCase().toCharArray()){
            if (!hashMap.containsKey(c)){
                return false;
            }else {
                if((Integer)hashMap.get(c)<0){
                    return false;
                }
                Integer value=(Integer)hashMap.get(c);
                hashMap.put(c,--value);
            }
        }
        return true;
    }

}
