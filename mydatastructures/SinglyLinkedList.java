package mydatastructures;

import java.util.Random;


class SinglyNode{
    int data;
    SinglyNode nextNode=null;
    SinglyNode(int data){
        this.data=data;
    }
}
public class SinglyLinkedList {

    SinglyNode head;

    public SinglyNode addNode(int data){ // adds at the end of the list
        if (head==null){
            head=new SinglyNode(data);
            return head;
        }
        SinglyNode pointer= head;
        while (pointer.nextNode!=null){ // walk utill the cliff
            pointer=pointer.nextNode;
        }
        pointer.nextNode=new SinglyNode(data);

        return head;
    }

    public SinglyNode addNodeFront(int data){ // add to the front of the list
        if (head==null) {
            head= new SinglyNode(data);
            return head;
        }
        SinglyNode temp=head;
        head=new SinglyNode(data);
        head.nextNode=temp;


        return head;
    }

    //Insert a node at a specific position in a linked list

    public SinglyNode addKthPositionFromEnd(int data,int position){

        SinglyNode fastPointer=head;

        SinglyNode slowPointer=head;

        int k=0;
        while (fastPointer!=null){ // calculate the size of the list
               fastPointer=fastPointer.nextNode.nextNode;
               k=k+2;
        }

        if (k-position<0) return null; // can's insert

        int insertIndex=k-position;



        while (insertIndex!=0){
            insertIndex--;
            slowPointer=slowPointer.nextNode;
        }


        SinglyNode newNode=new SinglyNode(data);
        newNode.nextNode=slowPointer.nextNode;
        slowPointer.nextNode=newNode;

        return head;
    }

    boolean deleteNode(SinglyNode head){
        while (head!=null){
            head=head.nextNode;
        }

        return false;
    }



    void printLinkedList(){

        SinglyNode printer= head;
        while (printer!=null){
            System.out.println("Printing data "+printer.data);
            printer=printer.nextNode;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList= new SinglyLinkedList();
        Random rn= new Random(100);

        //linkedList.addNode(1);
        //linkedList.addNode(2);

        for(int i=0;i<10;i++){
            linkedList.addNode(i); // adds a node to the end of the list
        }
        for(int i=20;i>10;i--){
            linkedList.addNodeFront(i); // adds Node in the front  just like a queue's enqueue operation
        }


        linkedList.addKthPositionFromEnd(33,3);



        linkedList.printLinkedList();

        Employee employee= new SalesMan();
        employee.method1();

        //SalesMan


    }

}


class Employee{

  static  int member=1;
  void method1(){
  }

}

class SalesMan extends Employee{
        void method2(){

        }
}

abstract class MyAbstract{

}

interface myInterface{
     void somemethod();
     void dosomemethod2();
}
class someInfterfaceImplemtingClass implements myInterface{
    @Override
    public void somemethod() {

    }

    @Override
    public void dosomemethod2() {

    }
}



