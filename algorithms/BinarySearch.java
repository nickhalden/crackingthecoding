package algorithms;

/**
 * Created by vn0dht3 on 1/1/17.
 */
public class BinarySearch {


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};  // log n find the element in the array
        //binarySearch(arr,1);
        //binarySearch(arr,8);
        //binarySearch(arr,20);

        for (Integer i :arr){
            binarySearch(arr,i);
        }



    }
    public static void binarySearch(int arr[],int item){

        System.out.println("Executing binary search for element : "+item);

        int low=0;

        int high=arr.length;

        int mid=(low+high)/2;


        while (mid<high  && mid>low){
            if (item==arr[mid]){
                System.out.println("Element found "+item);
                break;
            }
            if (item> arr[mid]){ // element present on the left side
                mid=(mid+high)/2;
            }else {
                mid=(low+mid-2)/2;
            }
        }

    }
    public static int[] quickSort(int arr[]){

        int pp[]={1,3};

        return pp;
    }
    public static void mergeSort(int arr[]){

    }

}
