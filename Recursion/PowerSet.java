package Recursion;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by vn0dht3 on 1/12/17.
 */
public class PowerSet{
    String str = "abcd"; //our string
    public static void main(String []args){
        PowerSet ps = new PowerSet();
        for(int i = 0; i< ps.str.length();i++){ //traverse through all characters
            ps.subs("",i);
        }

        System.out.println(ps.factorial(5));

        System.out.println(ps.power(3,9));

        System.out.println(ps.fibonacci(1));

        System.out.println(ps.sum(10));

        int arr2[] = {2, 4, 5};
        //System.out.println(ps.subset("nipun",0));

        ps.permute("nipun");

        System.out.println("------");
        ps.combine("nipun");


    }

    void subs(String substr,int index)
    {
        String s = ""+str.charAt(index); //very important, create a variable on each stack
        s = substr+s; //append the subset so far
        System.out.println(s); //print

        for(int i=index+1;i<str.length();i++)
            subs(s,i); //call recursively

    }
    int factorial(int n){
        // base case power(1) == 1
        if (n==1) return 1 ;

        int result=n*factorial(n-1); // 5* factorial(4)

        return result;
    }

    int power(int n,int p){
        if (p==1) return n;
        return n*power(n,p-1);
    }

    int fibonacci(int n){
        //1 1 2 3 5 8 13     5+fib(4) 4+fib(3) 3+fib(2) 2+ fib(1) 1+ fib(0_


        if (n==1 || n==0 || n<0) return 1;

        int result=fibonacci(n-1)+fibonacci(n-2); // fib(3) = fib(2) + fib(1)
                                      // fib(2) =1
                                      // fib(1) =1
                                      // fib(4) = fib(2)+fib(3)
        return  result;

    }

    int sum(int n){
        //1+2+3+4
        if (n==1) return 1;
        return n+sum(n-1); // return 4+ sum(3)
                              //            return 3+ sum(2)
    }

    String subset(String arr,int i){
        // arr={};
        // We can recursively solve this problem.
        // There are total 2n subsets. For every element, we consider two choices,
        // we include it in a subset and we don’t include it in a subset.
        // Below is recursive solution based on this idea.


//        if (i==arr.length-1) return arr[i]; //
//        subset(arr,i++); // 1 , 2 , 3  {1}, {1,2},{1,3},    {1,2,3},{2},{2,3},{3}
//        return 1;

//        if (i== arr.length()) return arr.charAt(i);


        return arr.charAt(i)+subset(arr,i+1);

    }

    public void permute(String incoming){
        char input[]=incoming.toCharArray();
        // stores the character and the count information
        // in the sorted format
        Map<Character,Integer> countMap=new TreeMap<>();
        for(char ch : input){
            if (!countMap.containsKey(ch)){
                countMap.put(ch,1);
            }else {
                countMap.put(ch,countMap.get(ch)+1);
            }
        }
        System.out.println(countMap);
        char str[]= new char[countMap.size()];
        int count[]= new int[countMap.size()];
        int index=0;
        for (Map.Entry<Character,Integer> entry: countMap.entrySet()){
            str[index]=entry.getKey();
            count[index]=entry.getValue();
            index++;
        }

        for(int i=0;i<str.length;i++)
        System.out.println(str[i]);
        System.out.println(count);

        char result[]= new char[input.length];

        permuteUtil(str,count,result,0);


    }
    public void permuteUtil(char str[],int count[],char result[] , int level){

        //base case
        if(level== result.length){ // means that we have traversed the who string
            printArray(result);
            return;
        }


        for (int i=0;i<str.length;i++){
            if (count[i]==0){
                continue;
            }
            result[level]=str[i]; // intermediate result at a level
            count[i]--; // count updated to count-1 in the array where it was 1 or greater than one
            permuteUtil(str,count,result,level+1);
            count[i]++;
        }

    }
    public void printArray(char input[]){
        for(char c : input){
            System.out.print(c);
        }
        System.out.println();
    }
    // combination

    public void combine(String string){
        char input[]=string.toCharArray();
        Map<Character,Integer> countMap= new TreeMap<>();
        for(char ch: input){
            if(countMap.containsKey(ch)){
                countMap.put(ch,countMap.get(ch)+1);
            }else {
                countMap.put(ch,1);
            }
        }

        char str[]=new char[countMap.size()];
        int count[]= new int[countMap.size()];

        int index=0;
        for (Map.Entry<Character,Integer> entry:countMap.entrySet()){ // unpacking or destructing
            count[index]=entry.getValue();
            str[index]=entry.getKey();
            index++;
        }

        char output[]=new char[countMap.size()];
        combine(input,count,0,output,0);


    }
    public void combine(char input[], int count[],int pos, char output[],int len){ //method overloading
        printCombinations(output,len);
        if(len==input.length){ // base condition
            printArray(input);
        }

        for (int i=pos; i<str.length();i++){
            if(count[i]==0){
                len++;
                continue;
            }
            output[i]=input[i];
            count[i]--;
            combine(input,count,i,output,len+1);
            count[i]++;
        }

    }
    void printCombinations(char result[],int pos){
            for (char c : result){
                if(c>65 && c<127) System.out.print(c);
            }
            System.out.println();
    }


    void queensProblem(){

    }
    void towwerOfHonoi(){

    }

}