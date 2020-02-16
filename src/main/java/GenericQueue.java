/*
This generic class characterizes the queue data structure, in which new data members
are added to the back of our linked list. This means our head continues to point at
the first node added.
 */

public class GenericQueue<I> extends GenericList<I> {
    private Node<I> front, back;       //Track back of list as well so we know where to add new nodes

    //Initializes head of linked list with data
    public GenericQueue(I d){
        Node<I> h = new Node<I>();
        h.data = d;
        h.next = null;
        setHead(h);

        this.front = this.back = h;
        setLength(1);
    }

    //Adds node to back of linked list. Head node stays the same
    @Override
    public void add(I d){
        Node<I> temp = new Node<I>();
        temp.data = d;

        //The front and back of the queue become new node if list was empty
        if(front == null){
            front = back = temp;
        } else {                //otherwise, just add node onto end of the list
            back.next = temp;
            back = temp;
            back.next = null;
        }

        //just increment length since new node was added
        setLength(getLength() + 1);
    }

    //Enqueue just calls add(I data)
    public void enqueue(I data){
        add(data);
    }

    //Dequeue just calls delete()
    public I dequeue(){
        return delete();
    }

    /* Getters for private front and back node trackers of Queue */
    public Node<I> getFront(){
        return front;
    }

    public Node<I> getBack(){
        return back;
    }


}
