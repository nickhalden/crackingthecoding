/**
 * Created by vn0dht3 on 12/20/16.
 */


// whenever we talk about data structures
// we are mainly concerned  about insert,find and deleting
public class MyMinHeap {

    int myheap[];
    int capacity;
    int height=0;
    int hole;

    MyMinHeap(int size){
        capacity=size;
        myheap=new int[capacity];
        myheap[0]= Integer.MAX_VALUE;

    }

    void percolate(int element){
        if (myheap[height/2]>element) { // heap property satisfied
            return;

            }else { // swap the node with the root node present at h/2 with the value inserted at hole
                int temp=myheap[hole];   // element at hole
                myheap[hole]=myheap[height/2]; // swap swap swap  :)
                myheap[height/2]=temp;  // make the element at hole the root element
                hole=height/2;
                percolate(element); // repeat until it reaches it's correct place
            }
    }

    int findMin(){ // returns the minimum always at the first index of the array
        return myheap[1];

    }

    int find(int element){ // return the index of the element to be deleteds

        return 0;
        //return index;

    }

    void insert(int element){

        if (hole>capacity){
            System.out.println("Array index out of bound");
            return;// cannot insert because of array index out of bound(overflow)
        }else {
            // simple insertion
            // insert on the right if it is greater than the root
                //if (2height+1)
                myheap[2*height+1]=element;
                height=height++;// increase the level
            // insert on the left
                myheap[2*height]=element;

            // check if there is a need to percolate up
                percolate(element);

            }
        }
    void delete(int element){ // find and delete


    }






}

class Main{
    public static void main(String[] args) {
        MyMinHeap heap= new MyMinHeap(10);
        heap.insert(10);
        heap.insert(12);
        System.out.println(heap.findMin());


    }



}


