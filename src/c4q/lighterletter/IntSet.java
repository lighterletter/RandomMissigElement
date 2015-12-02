package c4q.lighterletter;

/**
 * Created by c4q-john on 12/2/15.
 * class that creates a list as a set where you can use primitive types.
 * ( Custom iplementation of an array)
 *
 * trying to create Set<int>
 *
 *     failing miserably.
 */
public class IntSet {
    int size;
    int index;
    Node head; //attempting to implement this as a stacked list of recursions.

    //Since it's specialized. We'll be defining the size of this set so the constructor will take in an integer.
    public IntSet(int size) {
        this.size = size;
        head = head.next;
    }



    public int get(int request){


        return

    }

    //Get: returns element at index requested.

    //Methods I need: The point of this class is to create a collection of unique elements and so I need to make sure
    // that there is only one object of it's value within this.
}
 class Node{

    Node next;
    int index;
     int value;
}
