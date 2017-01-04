import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue <AnyType>  implements Iterable<AnyType>{

    AnyType queue[];
    private int head=-1;
    private int tail=-1;
    public int size;

    public int getSize(){
        return this.size;
    }
    MyQueue(int size){
        queue=(AnyType[]) new Object[size]; // genric object casted to anytype
    }

    boolean contains(AnyType element){ // %
        for (int i =0;i<queue.length;i++){
            if (queue[i].equals(element)){
                return true;
            }
        }

        return false;
    }
    public void enqueue(AnyType element){// push the element

        if (tail>queue.length) tail=tail%queue.length;
        queue[++tail]=element;
        size++;
    }
    public void dequeue(){
        if (size<=0) return;
        queue[++head] = null;
        System.gc();
        //queue[head]
    }

    public AnyType peek(){
       if (isEmpty())
        return (AnyType) new ArrayStoreException("");
       return queue[tail];
    }
    public boolean isEmpty(){
        return (head==-1&& tail==-1);
    }

    // create an iterator as well
    /**
     * This is the implementation of the ArrayListIterator.
     * It maintains a notion of a current position and of
     * course the implicit reference to the MyArrayList.
     */


    private class QueueIterator implements java.util.Iterator<AnyType>
    {
        private int current = 0;
        private boolean okToRemove = false;

        public boolean hasNext( )
        {
            return current < getSize( );
        }


        public AnyType next( )
        {
            if( !hasNext( ) )
                throw new java.util.NoSuchElementException( );

            okToRemove = true;
            return queue[ current++ ];
        }

        public void remove( )
        {
            if( !okToRemove )
                throw new IllegalStateException( );

            MyQueue.this.dequeue( );
            --current;
            okToRemove = false;
        }




    }
    @Override
    public Iterator<AnyType> iterator() {
        return  new QueueIterator( );
    }
    public String toString() {
        return "Queue [front=" + head + ", rear=" + tail + ", size=" + size
                + ", queue=" + Arrays.toString(queue) + "]";
    }

}
class TestMyQueue{

    public static void main(String[] args) {

        Queue<Integer> testQuue=new LinkedList<>();

        MyQueue<Integer> myQueue= new MyQueue<Integer>(3);
        myQueue.dequeue();
        System.out.println(myQueue.isEmpty());
        myQueue.enqueue(91);
        myQueue.enqueue(99);
        myQueue.enqueue(100);

        myQueue.dequeue();
        System.out.println("Tail is "+ myQueue.peek());

        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.getSize());

        Iterator<Integer> itr = myQueue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next( ));
        }

        System.out.println("-------");
        System.out.println(myQueue.toString());


    }
}
