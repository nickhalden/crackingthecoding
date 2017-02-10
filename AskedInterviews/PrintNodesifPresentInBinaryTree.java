package AskedInterviews;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * Created by vn0dht3 on 1/13/17.
 */
public class PrintNodesifPresentInBinaryTree {

    BinaryNode root;
    private class BinaryNode{
        int data;
        BinaryNode left;
        BinaryNode right;
        BinaryNode(int data){
            this.data= data;
        }
    }

    public BinaryNode getRoot() {
        return root;
    }

    //

    private boolean addNode(int data){
        // if the first node is root node then add it as root node
        // if the item is less than the node.data then it goes on the left
        // if the item is more than node.data then it goes on the right
        //using iterative approach
        if (root== null) {
            root= new BinaryNode(data);
            return true;
        }
        BinaryNode cursor=root;
        while (cursor.left!=null && cursor.right!=null){
//            if (cursor.data==data) return false ; // already present
            if (cursor.data>data) {
                cursor=cursor.left;
                System.out.println("Adding on the left");
            }
            else {
                cursor=cursor.right;
                System.out.println("Adding on the right");

            }
        }
        System.out.println("Adding child to the node "+cursor.data);
        if(cursor.data>data) cursor.left=new BinaryNode(data);
        else  cursor.right=new BinaryNode(data);
        return true;
    }

    boolean deleteNode(int item){
         /* max-heap formed while
                        10                11
                       /    \            /  \
                     7       11  =>     7    31   =>
                    /  \     /  \      / \   /
                   6     8  12   31    6  8  12

           Deleting
           // if I delete the root node then the then if there is a node at the right of root ie root.right and
           // if (root.right.right!== null this node moves up
           // else if (root.right.left != null) this node moves up
           // or if it the root.right does not have any children then it moves up

           // if it is some other node then also move the node up
           // then also move the node.right up

           // if it is a leaf node the just set the pointer =null
         */


        BinaryNode pointer= root;

        while (pointer.left!=null|| pointer.right!=null){
            if (pointer.left.data>item) pointer=pointer.left;
            else if (pointer.right.data<item) pointer=pointer.right;
            else { //pointer.data==item
                if(pointer.left.right==null && pointer.left.right==null) {
                    pointer.left=null;
                    return true; // the node to be deleted does not have any childere
                }
                if (pointer.right!= null){
                    if (pointer.right.right!=null){
                        pointer.right.right.left=pointer.right.left;
                        //pointer;
                        pointer.left=pointer.right.right;

                    }else {

                    }
                }else {
                    pointer.right=null;
                }
            }

        }

        return false;
    }
    void addNodeRecursive(){

    }

    void printNodes(){
        BinaryNode  pointer=root;

        System.out.println();
        pointer=pointer;
    }

    public static void main(String[] args) {
        PrintNodesifPresentInBinaryTree obj= new PrintNodesifPresentInBinaryTree();
        System.out.println(obj.addNode(10));
        System.out.println(obj.addNode(11));
        System.out.println(obj.addNode(7));
        System.out.println(obj.addNode(8));
        System.out.println(obj.addNode(6));

        Random random= new Random();

//        for (int i=0;i<10;i++){
//            int value=random.nextInt(100);
//            System.out.println("inserting "+value);
//        }

        /* max-heap formed while inserting
                        10                11
                       /    \            /  \
                     7       11  =>     7    31   =>
                    /  \     /  \      / \   /
                   6     8  12   31    6  8  12

           Deleting
           // if I delete the root node then the then if there is a node at the right of root ie root.right and
           // if (root.right.right!== null this node moves up
           // else if (root.right.left != null) this node moves up
           // or if it the root.right does not have any children then it moves up

           // if it is some other node then also move the node up
           // then also move the node.right up

           // if it is a leaf node the just set the pointer =null
         */


        System.out.println(obj.getRoot().left.left.data);








    }


}
