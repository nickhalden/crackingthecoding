package mydatastructures;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by vn0dht3 on 1/5/17.
 */
class SinglyNodeWithCycles{
      int data;
      SinglyNodeWithCycles next=null;

    SinglyNodeWithCycles(int data){
        this.data=data;
    }

}
public class LinkedListWithACycle {

    SinglyNodeWithCycles head;



    void addNode(int data){

        if (head==null)  {
            head=new SinglyNodeWithCycles(data);
            return;
        }
        SinglyNodeWithCycles pointer= head;

        while (pointer.next!=null){
            pointer=pointer.next;
        }

        pointer.next=new SinglyNodeWithCycles(data);

    }

    public void detectAndRemoveLoop(){
        SinglyNodeWithCycles pointer= head;
        HashSet<Integer> hashMap= new HashSet<>();
        while (pointer!=null){
            if (!hashMap.contains(pointer.data)){
                hashMap.add(pointer.data);
            }
            pointer=pointer.next;
        }
    }

    public static void main(String[] args) {

    }

}

