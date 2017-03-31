public class DLLNode{


    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _backNode;

    // constructor -- initializes instance vars
    public DLLNode( String value, DLLNode next, DLLNode back ) 
    {

	_cargo = value;
	_nextNode= next;
	_backNode=back;

    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getBack() { return _backNode;}
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) 
{

    _cargo = newCargo;
    return _cargo;
    }

    public DLLNode setNext( DLLNode newNext ) 
{
    _nextNode = newNext;
    return _nextNode;
    }


    public DLLNode setBack (DLLNode newBack){
	_backNode=newBack;
	return newBack;
    }

    
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }







}
