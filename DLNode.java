/*****************************************************
 * class DLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLNode<T>
{

    private T _cargo;    //cargo may only be of type String
    private DLNode<T> _nextNode; //pointer to next DLNode
    private DLNode<T> _lastNode; //pointer to the last node
    // constructor -- initializes instance vars
    public DLNode(DLNode<T> last, T value, DLNode<T> next)
    {
        _lastNode = last;
        _cargo = value;
        //DLNode: can be null or point to another node
        _nextNode = next;

    }


    //--------------v  ACCESSORS  v--------------
    public T getValue() {
        return getCargo();
    }
    public T getCargo() { return _cargo; }

    public DLNode<T> getNext() { return _nextNode; }
    public DLNode<T> getLast() { return _lastNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setValue(T newCargo) {
        return setCargo(newCargo);
    }
    public T setCargo( T newCargo )
{
    T old = _cargo;
    _cargo = newCargo;
    return old;

    }

    public DLNode<T> setNext( DLNode<T> newNext )
{
    DLNode<T> old = _nextNode;
    _nextNode = newNext;
    return old;
    }
    public DLNode<T> setLast(DLNode<T> newLast) {
        DLNode<T> old = _lastNode;
        _lastNode = newLast;
        return old;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    //simply prints what this is carrying.
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args )
{

	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
	//Below is an exercise in creating a linked list...

	//Create a node
	DLNode first = new DLNode( "cat", null );

	//Create a new node after the first
	first.setNext( new DLNode( "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new DLNode( "cow", null ) );
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	/* A naive list traversal:
	while( first != null ) {
	    System.out.println( first );
	    first = first.getNext();
	}
	*/

	//Q: When head ptr moves to next node in list,
	//   what happens to the node it just left?


    }//end main

}//end class DLNode
