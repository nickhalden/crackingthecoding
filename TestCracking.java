import java.util.ArrayList;

/**
 * Created by vn0dht3 on 11/26/16.
 */

class TestCracking{
    public static void main(String[] args) {
        Cracking cracking= new Cracking();
        System.out.println(cracking.isUnique("abcd"));
        System.out.println(cracking.permutationCheck("dog","god"));
        String dates[]={"Mon Jan  5 16:05:29"};

        String ans[]=cracking.reformatDate(dates);

        for (Object ele: cracking.reformatDate(dates)){
            System.out.println(ele);

        }






    }
}
