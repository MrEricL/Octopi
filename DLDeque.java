import java.util.NoSuchElementException;
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
        //else, just set front to it's next element
    	_first = _first.getNext();
        //get rid of backwards linkage:
        _first.setLast(null);
        //if there's one element, make sure to set both _first and _last to point to null
        if (_size==1){
            _last=_first;
        }
    	_size--;
    	return ret;
    }
    //pop _last element
    public T removeLast(){
        if (_size==0) throw new NoSuchElementException(); //throw error if necessary
        T ret = _last.getValue();
        //else, just set front to it's next element
        _last = _last.getNext();
        //get rid of backwards linkage:
        _last.setNext(null);
        //if there's one element, make sure to set both _first and _last to point to null
        if (_size==1){
            _first=_last;
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


    //main method for testing:

    public static void main(String[] a) {
        //create a new Deque
        Deque<String> q = new DLDeque<String>();
        System.out.println(q);//blank
        q.addFirst("A");
        System.out.println(q);
        q.addLast("L");
        System.out.println(q);
        q.addFirst("M");

    }





}
