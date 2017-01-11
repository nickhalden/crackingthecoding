package mydatastructures;

import java.util.Random;

/**
 * Created by vn0dht3 on 1/10/17.
 */

// constant time insertion and deletion using Linkedin
public class MyListQueue {
    private class Node{
            int data;
            Node next;

            Node(int data){
                this.data= data;
            }
    }
    Node head;
    Node tail;

    boolean isEmpty(){
        return head==null;
    }

    int peek(){
        if (isEmpty())
        System.out.println("Trying to look into an empty queue");
        return tail.data;
    }

    void enqueue(int data){

        if (isEmpty()) // head == null // first insert; so increment both tail and head point to the same element
        {
            head= new Node(data);
            tail=head;
            return;
        }
        // there are already elements present

        tail.next=new Node(data);
        tail=tail.next;



    }
    int dequeue(){ // remove the front // also known as  poll
        if (isEmpty()) {
            System.out.println("Cannot dequeue from an empty queue");
            return Integer.MIN_VALUE;
        }

        int dequeueItem=head.data;
        head=head.next;
        return dequeueItem;
    }


}

class TestMyLinkedQueu{

    public static void main(String[] args) {
        MyListQueue myListQueue= new MyListQueue();
        myListQueue.enqueue(10);
        myListQueue.enqueue(20);
        System.out.println(myListQueue.dequeue());
        System.out.println(myListQueue.dequeue());

        Random random= new Random();

        System.out.println("*******");
        for(int i=0;i<20;i++){
            int value=random.nextInt(40);
            System.out.print(" "+value);
            myListQueue.enqueue(value);
        }
        System.out.println();
        for (int i=0;i<21;i++){
            System.out.print(" "+myListQueue.dequeue());
        }


    }

}
