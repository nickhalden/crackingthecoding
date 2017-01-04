import java.util.Arrays;

/**
 * Created by vn0dht3 on 1/1/17.
 */
public class QueueBalaji {
}

/**
 * Created by  on 2/26/2015.
 */

/**
 *  Array based queue that stores index of front and rear elements.
 *  If queue gets full, it raises an exception.  It could have been
 *  designed to resize array to accommodate additional elements.
 *  If queue is empty, a call to Dequeue raise an exception.
 */


class ArrayQueue<T> {
    private int front, rear;  // index of front and rear elements of the queue
    private int size, maxSize;  // size is the actual number of elements in the queue;  maxSize is size of array
    private T[] Q;

    // Constructor
    ArrayQueue(int s) {
        maxSize = s;
        front = 0;
        rear = -1;  // when array has no elements, rear index is to the left of front;  could also be maxSize-1
        size = 0;
        Q = (T[]) new Object[maxSize];  // generates compile time warning
    }

    /** Add a new element x to the queue to the end of the queue
     *  @param: x   item of type T to be added to the queue
     */
    void add(T x) throws Exception { enqueue(x); }

    void enqueue(T x) throws Exception {
        if ( !isFull() ) {
            // If rear goes past the end of the queue array, it wraps back to 0
            rear = (rear + 1) % maxSize;
            Q[rear] = x;
            size++;
        } else {  // Queue is full.  Raise exception or resize queue
            /*
            New logic written to resize the queue
             */
            T[] newQ;
            int k=front;
            int i=0;
            /*
            This condition checks if front is greater than rear,
            if true then we copy the existing values to a new queue
            and set the front to zero and rear to maxsize
             */
            if(front>rear) {
                newQ = (T[]) new Object[maxSize*2];
                for (; k < maxSize; i++, k++) {
                    newQ[i] = Q[k];
                }
                for (k=0;k<=rear;i++,k++ ) {
                    newQ[i] = Q[k];
                }
                front=0;
                //i-1 as the previous value did a +1 and then the condition was checked
                rear = i-1;
            }
            else{
                /*
                Using java's copy of method which is useful for array resize,
                this can be used as the new array with double the size
                will have the same order of elements as the original array Q.(front < rear)
                 */
                newQ = Arrays.copyOf(Q, Q.length * 2);
            }
            maxSize=maxSize*2;
            Q = newQ;
            //Call the enqueue function again as the array is resized and new value can be inserted
            enqueue(x);
            System.out.println();
            System.out.println("Debug: Successfully resized and inserted new value " + x);
        }
    }


    /** Remove the head element from the queue and return it */
    T remove() throws Exception { return dequeue(); }

    T dequeue() throws Exception {
        if ( !isEmpty() ) {
            T tmp = Q[front];
            size--;
            // If front goes past the end of the queue array, it wraps back to 0
            front = (front+1) % maxSize;
            return tmp;
        } else {
            throw new Exception("Queue is empty");
        }
    }

    boolean isEmpty()  { return size == 0; }

    boolean isFull()  { return size == maxSize; }

    void resize() {  // to be implemented

    }

    /** Sample driver program.  Output: 1 2 3 4 5 6 7 8 9 10 11 12 */
    public static void main (String [] args) throws Exception {
        ArrayQueue<Integer> A = new ArrayQueue<>(5);

        for(int i=1; i<=5; i++) {
            Integer x = new Integer(i);
            A.add(x);
        }
        /*
        Array resize happens when the next value is inserted as the array is full
        But here front is less than rear
         */
        A.add(24);
        A.add(30);

        for(int i=6; i<=12; i++) {
            Integer x = A.remove();
            System.out.print(x + " ");
            x = new Integer(i);
            A.add(x);
        }

        A.add(45);
        A.add(25);
        A.add(85);
        /*
        Array resize happens when the next value is inserted
        Observe at this point front value is greater than rear and
        accordingly the logic is called in the enqueue function.
         */
        A.add(95);
        A.add(41);
        A.add(73);
        A.add(85);
        A.add(15);
        A.add(97);

        while(!A.isEmpty()) {
            Integer x = A.remove();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
