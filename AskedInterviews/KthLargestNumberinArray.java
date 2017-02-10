package AskedInterviews;

import java.util.Arrays;

/**
 * Created by vn0dht3 on 1/7/17.
 */

// complexity Worst case O(nlogn) -- sorting
public class KthLargestNumberinArray {

    public static void main(String[] args) {
        int arr[]= {6,7,8,9,10,1,2,3,4,5};

        sortMe(arr,2);

        int arr2[]= {2 ,3 ,6 ,6,5};
        withDuplicates(arr2,2);
        int arr3[]={1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        withDuplicates(arr,2);

    }
    public  static  void sortMe(int arr[],int k){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]); // Kth largest when no duplicates
    }

    public  static void withDuplicates(int arr2[],int k){
        Arrays.sort(arr2);

        for (Integer i: arr2){
            System.out.print(" "+i);
        }
        //2 3 5 6 6
        int high=arr2.length-1;
        while (k>1 && high >0){
            if (arr2[high]==arr2[high-1]) {
             high=high-1;
            }else {
                high=high-1;
                k--;
            }
        }

        System.out.println("\n"+arr2[high]);
    }


}
