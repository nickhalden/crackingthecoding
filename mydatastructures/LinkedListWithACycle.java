package mydatastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

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
        int count=0;
        SinglyNodeWithCycles pointer= head;
        HashSet<Integer> hashMap= new HashSet<>();
        while (pointer!=null){
            if (!hashMap.contains(" "+pointer.data)){
                hashMap.add(pointer.data);
                count++;
            }
            pointer=pointer.next;
        }
    }

    void printNodes(){
        SinglyNodeWithCycles pointer= head;
        while (pointer!=null){
            System.out.println(pointer.data);
            pointer=pointer.next;
        }
    }

    void addACycle(){
        //1+2+3+4+5+6
        //1->3->4->5->3
         addNode(1);
         addNode(3);
         addNode(4);
         addNode(5);
         head.next.next.next.next=head.next;
         System.out.println(head.next.next.next.next);
    }

    public SinglyNodeWithCycles reverseList(SinglyNodeWithCycles head) {
        if(head==null || head.next == null)
            return head;

        //get second node
        SinglyNodeWithCycles second = head.next;
        //set first's next to be null
        head.next = null;

        SinglyNodeWithCycles rest = reverseList(second);
        second.next = head;
        return rest;

    }


    public void reverseLinkedList(SinglyNodeWithCycles head,SinglyNodeWithCycles pointer){
        //@Todo


        if (head.next == null){
            pointer.next=null;
            head.next=pointer;
            return;
        }

        pointer=head; // save the node
        head= head.next; // move the head
        pointer.next=null; // break the association
        reverseLinkedList(head,pointer); // pass the moved head and the previous node for joining it




    }

    void printList(){
        SinglyNodeWithCycles pointer= head;
        System.out.println("Contents of the list are ");
        while (pointer!=null){
            System.out.print(" "+pointer.data);
            pointer=pointer.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListWithACycle linkedListWithACycle= new LinkedListWithACycle();

        Random random=new Random();
        System.out.println("adding" + 2);
        System.out.println("adding" + 30);
        linkedListWithACycle.addNode(2);
        linkedListWithACycle.addNode(30);
        for (int i=0;i<3;i++) {
            int value = random.nextInt(100);
            System.out.println("adding "+value);
            linkedListWithACycle.addNode(value);
        }
        linkedListWithACycle.addNode(40);
        System.out.println("adding" + 40);
        linkedListWithACycle.printList();


        linkedListWithACycle.reverseLinkedList();



        System.out.println("*********");

        linkedListWithACycle.printNodes();

        System.out.println("------");


        LinkedListWithACycle obj= new LinkedListWithACycle();
        obj.addACycle();
//        obj.detectAndRemoveLoop();

    }

}

