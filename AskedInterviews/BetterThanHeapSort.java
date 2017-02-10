package AskedInterviews;

import java.util.List;

/**
 * Created by vn0dht3 on 1/4/17.
 */
public class BetterThanHeapSort {

    public static void main(String[] args) {
            int arr1[]= {1,2,3,4,5};
            int arr2[]= {1,20,34,27};
            int arr3[]= {128,12,22};
            //sortMultipeSortedtoOne( arr1, arr2, arr3);
    }
    public static List sortArray(int arr1[], int arr2[], int arr[]){
        int index1=0;
        int index2=0;
        int index3=0;


        return  null;
    }
}

/*
Input: Multiple sorted (ascending) array of integers
Output: Sinlge sorted array of integers

K arrays
N integers per array
Total: N*K integers

List<Integer> sortArrays(List<List<Integer>> inputArrays)
{
}
NK (logNK)

//{1,2,3,11}
// {1,10,20}

1, 2, 6
10, 100, 200
3, 4, 5

10,20,30
1,2,3,6,7,8
11,22,33

Result: 1, 2, 3
 */


/*
// Implement a stack

class MyStack{

    private  int arr[];
    private int top=-1;
    final int DEFAULT=20000;
    public MyStack(int size){
        if (size>20000) Sysout();
        arr[]= new int[size];
        this.size=size;
    }

    public int size;
    void getSize(){
         return this.size;
    }
    void push(int element){
          //Charactar.valueOf('a')

          if (this.size<top) Sysout("Array index of bound");
          arr[++top]=element; //0=20;1=88
    }
    void isEmpty(){
        return (top == -1);
    }
    void pop(){
         if(isEmpty()) System.out.println("Array Index out of bounds");
         arr[top--];
    }

    int peek(){
         return arr[top];
    }
}

public class Test{

    public static void main(String args[]){

    MyStack stack= new Stack();
    stack.push(10);


    int input[]={7,8,10,12,6,4,1};

    findDip(input);
    }

    public int static findDip(int[] input){
    int start=1;
    int end()=input.length();

    int max=input[0];


    for(int i=start;i<length-1;i++){
           //if(input[i]>max) max= input[i];
           if input[i]<input[i+1] max=input[i+1];
           return max;
    }

    return max;


}





////








 */
