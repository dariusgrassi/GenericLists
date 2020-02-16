import java.util.Iterator;

/*
This generic class contains the logic for our iterator we can use to traverse
the linked list.
 */
public class GLIterator<I> implements Iterator<I> {
    private GenericList<I>.Node<I> count;

    //Logic to iterate through generic stack and queue
    public GLIterator(GenericList<I>.Node<I> head){
        count = head;
    }

    //checks to see if there is another value in the data structure and returns true or false
    @Override
    public boolean hasNext() {
        return count != null;
    }

    //returns the current value in the data structure and advances to the next item
    @Override
    public I next() {
        I cur = count.data;

        if(hasNext()){
            count = count.next;
        }

        return cur;
    }

    //IntelliJ is telling me I must have this method in here as well...
    @Override
    public void remove() { }
}
