import java.util.NoSuchElementException;
import java.util.Iterator;
public class DLDeque<T> implements Deque<T>{

    DLNode<T> _first;
    DLNode<T> _last;
    int _size;

    public DLDeque(){

	_first=null;
	_last=null;
	_size=0;
    }

    public void addFirst(T x){
        //when a queue has no element
    	if (_size==0){
    	    _last = _first = new DLNode<T> (null, x, null);
    	}
    	else {
    	    _first  = new DLNode<T> (null, x, _first);
            //also maintain double sided linkage:
            _first.getNext().setLast(_first);
    	}
    	_size++;
    }

    public void addLast(T x){
    	if (size()==0){
    	    _first = _last = new DLNode<T> (null, x, null);
    	}
    	else {
    	    _last = new DLNode<T> (_last, x, null);
            //also maintain double sided linkage:
            _last.getLast().setNext(_last);
    	}
    	_size++;
    }
    //pop _first element
    public T removeFirst(){

        if (_size==0) throw new NoSuchElementException(); //throw error if necessary
        T ret = _first.getValue();

        if (_size==1){
            _first=_last;
        }


	else {
        //else, just set front to it's next element
        _first = _first.getNext();
        //get rid of backwards linkage:
        _first.setLast(null);
        //if there's one element, make sure to set both _first and _last to point to null
	}
        _size--;
        return ret;
    }
    //pop _last element
    public T removeLast(){

        if (_size==0) throw new NoSuchElementException(); //throw error if necessary
        T ret = _last.getValue();

        if (_size==1){
            _first=_last;
        }


	else {
        //else, just set front to it's next element
        _last = _last.getLast();
        //get rid of backwards linkage:
        _last.setNext(null);
        //if there's one element, make sure to set both _first and _last to point to null
	}
        _size--;
        return ret;
    }

    public T getFirst(){
        if (_size==0) throw new NoSuchElementException(); //throw error if necessary
        return _first.getValue();
    }

    public T getLast(){
        if (_size==0) throw new NoSuchElementException(); //throw error if necessary
        return _last.getValue();
    }

    public int size(){
        return _size;
    }
    public String toString() {
        //print from front to end with delim:
        String ret = new String();
        String delim = " ";
        DLNode<T> tmp = _first;
        while (tmp != null) {
            ret+=tmp.getValue().toString()+delim;
            tmp=tmp.getNext();
        }
        return ret;
    }

    //QUEUE COMPATIBILITY METHODS:
    public T dequeue() {return removeFirst();}
    public void enqueue(T ob) {addLast(ob);}
    public boolean isEmpty() {return _size==0;}
    public T peekFront() {return getFirst();}
    //ITERATOR:
    public Iterator<T> iterator()
    {
        return new MyIterator();
    }


    //main method for testing:

    public static void main(String[] a) {
        //create a new Deque
        Deque<String> q = new DLDeque<String>();
        System.out.println(q);//blank
        q.addLast("L");
        System.out.println(q);
        q.addFirst("P");
        q.addFirst("P");
        System.out.println(q);
        q.addLast("E");
        System.out.println(q);
        q.addFirst("A");
	System.out.println(q); //apple
	//	System.out.println(q.getLast());
	System.out.println(q.removeLast());
	System.out.println(q);
	System.out.println(q.removeFirst());
	System.out.println(q);
    for (String s: q) System.out.println(s);
    }




    private class MyIterator implements Iterator<T>
    {

    private DLNode<T> _dummy; // dummy node to tracking pos
    private boolean _okToRemove; //flag indicates next() was called

    //constructor
    public MyIterator()
    {
        //place dummy node in front of head
            //...other housekeeping chores?
            /* YOUR IMPLEMENTATION HERE */
        _dummy = new DLNode<T>(null,null,_first);
        _okToRemove = false;
    }

    //--------------v  Iterator interface methods  v-------------
    //return true if iteration has more elements.
    public boolean hasNext()
    {
            /* YOUR IMPLEMENTATION HERE */
        return _dummy.getNext() != null;
    }


    //return next element in this iteration
    public T next()
    {
            /* YOUR IMPLEMENTATION HERE */
        _dummy = _dummy.getNext();
        if (_dummy == null) throw new NoSuchElementException("No such element");
        //not seen before, thanks Mr. Brown.
        _okToRemove = true;
        //you know that there is an item that you can remove here. Haf fun
        return _dummy.getCargo();
    }


    //return last element returned by this iterator (from last next() call)
    public void remove()
    {
        if ( ! _okToRemove )
        throw new IllegalStateException("must call next() beforehand");
        _okToRemove = false;

        //If removing only remaining node...
        //maintain invariant that _dummy always points to a node
        //   (...so that hasNext() will not crash)

            /* YOUR IMPLEMENTATION HERE */
        if (_dummy == null) {
        throw new IllegalStateException("No nodes available, add elements to your list"); //RECHECK THIS LATER NOT SURE
        }


        //if removing first node...
            /* YOUR IMPLEMENTATION HERE */
        if (_dummy.equals(_first)){
            if (_first.getNext()==null) {
                _first = null;
            }
            else {
                //set the node after the head to no longer point back to the head
                _first.getNext().setLast(null);
                _first = _first.getNext();
            }
        }
        //if removing last node...
            /* YOUR IMPLEMENTATION HERE */
        else if (_dummy.equals(_last)){
            if (_last.getLast()==null) {
                _last = null;
            }
            else {
                //set the node before the tail to no longer refer back to the tail
                _last.getLast().setNext(null);
                _last = _last.getLast();
            }
        }
        //if removing an interior node...
        else {
            //get the items before and after the node to refer to eachother rather than to the no longer existent node
            _dummy.getNext().setLast(_dummy.getLast());
            _dummy.getLast().setNext(_dummy.getNext());
        }
            /* YOUR IMPLEMENTATION HERE */

        _size--; //decrement size attribute of outer class LList
    }
    //--------------^  Iterator interface methods  ^--------------
    }//*************** end inner class MyIterator ***************






}
