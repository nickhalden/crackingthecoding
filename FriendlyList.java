import javax.net.ssl.SSLContext;
import java.security.Key;
import java.util.*;

/**
 * Created by vn0dht3 on 12/10/16.
 */
public class FriendlyList {

    public static void main(String[] args) {
            String input[]= {"listen","silent","this","hist"};

            Friend(input);

    }
    static void Friend(String[] input){

        NavigableMap<String,ArrayList<String>> hm= new TreeMap<>();

        for (String element: input){
            char arr[]=element.toCharArray();
            Arrays.sort(arr); // sort the string
            String str = String.valueOf(arr); //conversion to string

            if (!hm.containsKey(str)) {
                ArrayList<String> al = new ArrayList<>();
                al.add(element);
                hm.put(str, al);
            } else {
                hm.get(str).add(element);
            }

        }

        for (Object key: hm.entrySet() ){
            System.out.println(key);
        }


    }


}
