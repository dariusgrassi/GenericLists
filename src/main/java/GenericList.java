import java.util.ArrayList;

/*
This class contains the logic and functions for a generic linked list.
Since our queue and stack are essentially linked lists that operate slightly
different, both of them inherit this class.
 */
abstract class GenericList<I> implements CreateIterator<I> {
    //Inner class to define nodes of our linked list
    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(){
            next = null;
        }
    }

    private Node<I> head = new Node<>();    //head of our linked list
    private int length;

    //Prints out each element in linked list in order
    public void print(){
        while(head != null) {
            System.out.println(head.data);

            head = head.next;
        }

        if(length == 0)
            System.out.println("Empty List");
    }

    //Add method will be implemented different in Stack and Queue
    public abstract void add(I data);

    //Deletes first node in linked list, moves head to next node
    public I delete() {
        //if list is empty, there's nothing to delete
        if(head == null){
            return null;
        }

        I first = head.data;

        //Move head and update length
        if(length > 0){
            setHead(head.next);
            setLength(length-1);
            return first;       //Returns deleted nodes data
        }

        return null;
    }

    //Loops thru list adding each node to ArrayList and deleting it
    //from list, thus "dumping" it.
    public ArrayList<I> dumpList(){
        ArrayList<I> dump = new ArrayList<>();

        while(head != null){
            dump.add(delete());
        }

        return dump;
    }

    //Creates the iterator object to iterate thru list
    @Override
    public GLIterator<I> createIterator() {
        return new GLIterator<>(getHead());
    }

    /* Getters and setters for private data fields of list */

    public int getLength(){
        return length;
    }

    public void setLength(int x){
        length = x;
    }

    public Node<I> getHead(){
        return head;
    }

    public void setHead(Node<I> h){
        head = h;
    }

    public void setNext(Node<I> n){
        head.next = n;
    }
}
