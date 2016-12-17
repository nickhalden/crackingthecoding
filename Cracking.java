import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by vn0dht3 on 11/26/16.
 */
public class Cracking {
    //chapter one
    public boolean isUnique(String input){
        if (input.length()>127) return false;
        char arr[]=input.toCharArray();
        Boolean flags[]= new Boolean[127];
        Arrays.fill(flags, Boolean.FALSE);
        for (int i=0;i<input.length();i++){
            int val=input.charAt(i);
            if (flags[val]) return false;
            flags[val]=true;
        }

        return true;
    }
    public boolean isUniqueWithoutExtraSpace(String input){
        return false;
    }
    public boolean permutationCheck(String input1,String input2){
        assert (input1.length()>input2.length());
        char arr1[]=input1.toCharArray();
        char arr2[]=input2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String test1=(String)arr1.toString();
        String test2=(String)arr2.toString();
        System.out.println(test1.length()+test2.length());

        if (test1.equals(test2)){
            System.out.println("equal");
            return true;
        }
        System.out.println("not equal"+arr1.toString().equals(arr2.toString()));
        System.out.println(arr1);
        System.out.println(arr2);
        String a = new String(arr1);
        String b = new String(arr2);
        System.out.println(a == b); // prints false
        System.out.println(a.equals(b)); // prints true
        return false;
    }
    public boolean permuationCheckASCII(){
        return false;
    }
    static String[] reformatDate(String[] dates) {

        ArrayList<String> list = new ArrayList<>();

        HashMap<String,String> monthData = new HashMap<>();

        monthData.put("Jan", "01");
        monthData.put("Feb", "02");
        monthData.put("Mar", "03");
        monthData.put("Apr", "04");
        monthData.put("May", "05");
        monthData.put("Jun", "06");
        monthData.put("Jul", "07");
        monthData.put("Aug", "08");
        monthData.put("Sep", "09");
        monthData.put("Oct", "10");
        monthData.put("Nov", "11");
        monthData.put("Dec", "12");
        String CurrentResult = "";
        for(String current : dates){
            String[] read = current.split(" ");
            String tempDay = read[0];
            String year = read[2];
            String month = monthData.get(read[1]);
            int pos = 0;
            for(; pos<tempDay.length(); pos++){
                if((int)tempDay.charAt(pos)>=48 && (int)tempDay.charAt(pos)<=57  )
                    continue;
                else
                    break;
            }
            tempDay = tempDay.substring(0,pos);
            if(tempDay.length()==1)
                tempDay = "0" + tempDay;
            CurrentResult = year + "-" + month + "-" + tempDay;
            list.add(CurrentResult);
        }

        return list.toArray(new String[list.size()]);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


