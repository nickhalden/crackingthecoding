package algorithms;

import java.util.*;

/**
 * Created by vn0dht3 on 2/2/17.
 */
public class Second {
    public static void main(String[] args) {
        long arr[]={1,2, 4 ,5 , 7 ,1 ,3 };
        long k=6;
        HashMap<Long,Integer> hashMap = new HashMap<>();
//        Lon count=1;

        for(long i : arr){
            if(hashMap.containsKey(i)){
                System.out.println(i);

                Integer value=hashMap.get(i)+1;
                hashMap.put(i,value);


            }else{
                hashMap.put(i,1);

            }
        }


        System.out.println(hashMap.toString());


        int count=0;

        HashMap<Long,Long> hashMap1= new HashMap<>();

        for (Long key: hashMap.keySet()){
                if(hashMap.containsKey(k-key)&& hashMap.get(k-key)!=0){
                    if(key==k-key && hashMap.get(key)==1)
                        continue;
                    if(k-key<key){
                        hashMap1.put(k-key, key);
                    }else{
                        hashMap1.put(key,k-key);
                    }
                    hashMap.put(k-key, hashMap.get(k-key)-1);
                }
        }


        System.out.println(hashMap1.toString());


        int count1=10;
        for (long i:arr){
            if(hashMap.containsKey(i)){
                long value= hashMap.get(i);
                long key=i;




                if (key>value){
//                        hashSet.add(new Pair(key,value));
                        hashMap1.put(key,value);
                }else {
//                        hashSet.add(new Pair(value,key));
                        hashMap1.put(value,key);
                }



                //hashSet.add()
            }
        }


        System.out.println(hashSet.toString());

        System.out.println(hashMap.toString());

        System.out.println(hashMap1.toString());
    }


}

}




// valid parenthesis
class Braces{


    static  HashMap<Character,Character> hashMap= new HashMap<>();

    public static void main(String[] args) {
        String input= "{ {(([[]]))}}";

        Stack<Character> stack= new Stack<>();
        hashMap.put('{','}');
        hashMap.put('(',')');
        hashMap.put('[',']');


        for(int i=0;i<input.length();i++){

           if(hashMap.containsKey(input.charAt(i))){
               stack.push(input.charAt(i));
           }else {
               if(stack.size()==0)
               {
                   System.out.println("Not match");
                   break;
               }

                   if (input.charAt(i) == hashMap.get(stack.pop())) {
                       System.out.println("matching");
                   } else {
                       System.out.println("Not match");
                       break;
                   }

           }

        }


    }



}

 class Pair{


    int a;
    int b;

    public  Pair(int a,int b){
        this.a=a;
        this.b=b;
    }

     @Override
     public String toString() {
         System.out.println("("+a+","+b+")");
         return super.toString();
     }
 }

 class HuffmanCoding{

     static String Decoding(String[] encodings, String encodedstring) {

         HashMap<String, String> dict = new HashMap<>();
         int min = Integer.MAX_VALUE;
         for(String encoding : encodings){
             String[] split = encoding.split("\t");
             dict.put(split[1], split[0]);
             if(min > split[1].length())
                 min = split[1].length();
         }

         StringBuilder result = new StringBuilder();
         String code = "";
         int size = 0;
         for(char c : encodedstring.toCharArray()){
             if (++size < min){
                 code += c;
                 continue;
             }
             code += c;

             if(dict.containsKey(code)) {
                 String word = dict.get(code);
                 if(word.equals("[newline]"))
                     result.append("\n");
                 else
                     result.append(word);
                 size = 0;
                 code = "";
             }
         }
         return result.toString();
     }
 }

 class Range{
     public static void main(String[] args) {
//            int arr[]= new int[100];
//            Arrays.fill(arr,0);

            ArrayList<String> arrayList= new ArrayList<>();
            Random random= new Random();
//            for(int i=0;i<arr.length-1;i++){
//                arr[i]=random.nextInt(100);
//            }

            int arr[]={1,2,3,4,7,10,15,20,100,101,102,103,105,288};


            Arrays.sort(arr);
             for(int i: arr){
                 System.out.print(i+" ");
             }
            System.out.println();

         int lastSeen=0;
            int firstSeen=0;
            String string="";

         firstSeen=0;
         for (int i=0;i<arr.length-1;i++){
                if (arr[i+1]-arr[i]<=1){
                    string=Integer.toString(firstSeen);//0
                }else {
                    string=string+"->"+arr[(i)];//3
                    arrayList.add(string);
                    string=" ";
                    string=" " +arr[i];
                    firstSeen=arr[i];//3
                }
            }
            if(lastSeen!=arr[arr.length-1]);
            arrayList.add(firstSeen+"->"+arr[arr.length-1]);

           System.out.println(arrayList.toString());
     }
 }

// class Akash{
//    String s1;
//    String s2;
//    // fun
//    // random genre coding
//     // ascii
//     // pointers
//     // glassdoor
//     // os and c
//    // copy overlapping address;
//    // fundas
//     // malloc calloc
//     //new delete
//     // real time use /
//      //atoi
//     // not
//    // Arraylist List
//     // resume
//     Storage autpo
//           // mutex semaphore use cases
//              // spin lock when to use
//     //     monitor
//     //
//    LinkedList  // iterative
//
//
// }
