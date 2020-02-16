/*
This generic class characterizes the stack data structure, in which new data members
are added to the front of our linked list. This means our head will point at the
newest data member.
 */

public class GenericStack<I> extends GenericList<I> {

    //Constructor for stack object. Initializes head node.
    public GenericStack(I d){
        setLength(1);
        getHead().data = d;
    }

    //Adds new nodes to front of list, thus resetting head node.
    @Override
    public void add(I d) {
        Node<I> temp = new Node<I>();

        //Stores data and points node to previous front node
        temp.data = d;
        temp.next = getHead();

        //Sets head to point to new node and next to point prev front
        setHead(temp);
        setNext(temp.next);

        //Increments length
        setLength(getLength() + 1);
    }

    //Push just calls add(I data)
    public void push(I data){
        add(data);
    }

    //Pop just calls delete()
    public I pop(){
        return delete();
    }
}
