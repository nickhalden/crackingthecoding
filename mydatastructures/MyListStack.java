package mydatastructures;

import java.util.Random;

/**
 * Created by vn0dht3 on 1/9/17.
 */



public class MyListStack {


    private class StackNode{
        int data;
        StackNode next;

        StackNode(int data){
            this.data=data;
        }
    }

    StackNode head;
    //
    // stack operations
    //

    boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        if (isEmpty()){ // insert the first node
            head= new StackNode(data);
            return;
        }
        // else insert it at the front for O(1) insertion

        StackNode temp= head;
        head= new StackNode(data);
        head.next=temp;

    }
    public int  pop(){ // this stack returns a Min value if the stack is emtpy

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        int removedNode;
        if (head.next== null){
            removedNode=head.data;
            head= null; // move the reference ahead
            return removedNode;
        }
        removedNode=head.data;
        head=head.next;

        return removedNode;
    }
    public int peek(){ // returns Integer.MIN_VALUE if the stack is empty
        if (!isEmpty())    {
            return head.data;
        }
        System.out.println("Stack is empty: Cannot peek");
        return 0;
    }


}

class TestMyListStack{
    public static void main(String[] args) {
        MyListStack myListStack= new MyListStack();
        myListStack.pop();
        myListStack.peek();

        myListStack.push(10);
        System.out.println(myListStack.pop());
        System.out.println(myListStack.pop()); // this should error  as no more elements and returns a garbage value
       // myListStack.pop();// this should error  as no more elents

        System.out.println("***************");
        Random rn= new Random();
        for(int i=0;i<5;i++){
            int x=rn.nextInt(100);
            System.out.print(" "+x);
            myListStack.push(x);
        }
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print(" "+myListStack.pop());;
        }


    }

}
