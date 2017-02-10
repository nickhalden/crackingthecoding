package algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vn0dht3 on 2/2/17.
 *
 * Given the range for  the values of an array tell the median
 *
 */
public class BucketSort {

    public static void main(String[] args) {
        int capacity=100;
        int arr[]=new int[capacity];
        Random random= new Random();
        for(int i=0;i<capacity-1;i++){
            arr[i]=random.nextInt(100);
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int median=bucketSort(arr);

        System.out.println("median is "+ median);

    }
    public static  int    bucketSort(int arr[]){
        int newarr[]=new int[100]; // since the range is known that the values will be from 0-99
        Arrays.fill(newarr,0);
        for(int i=0;i<arr.length;i++){
            int index=arr[i];
            newarr[index]=newarr[index]+1;
        }
        int mid=arr.length/2;
        int ret=0;
        int sum=0;
        for(int i=0;i<newarr.length-1;i++){
            if (sum>mid) {
                ret=i;
                break;
            }
            sum=sum+newarr[i];
        }


        printElementsStatic(newarr);
        return ret;

    }

    public static  void   printElementsStatic(int arr[]){
        int index=0;

        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                while (arr[i]!=0){
                    System.out.print(i+" ");
                    arr[i]--;
                }
            }
        }

    }

}
