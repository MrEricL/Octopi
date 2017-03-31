//note no DLNode from mr brown

public class DLDeque<T> implments Deque{

    DLNode<T> first;
    DLNode<T> last;
    int size;

    public DLDeque(){

	first=null;
	last=null;
	size=0;
    }
    
    public void addFirst(T x){
	if (size()==0){
	    last = first = new DLNode<T> (null, x, null);
	}
	else {
	    first  = new DLNode<T> (null, x, first);
	}
	size++;
    }

    public void addLast(T x){
	if (size()==0){
	    last = first = new DLNode<T> (null, x, null);
	}
	else {
	    last  = new DLNode<T> (last, x, null);
	}
	size++;	
    }

    public T removeFirst(){
	T ret = first;
	
	if (size()==0) return null;
	else if (size()==1){

	    first=null;
	    last=null;
	}
	else if (size()==2){
	    first=last;
	}
	else{
	    first = new DLNode<T> (null, first.getNext(), first.getNext().getNext());
	    
	}

	size--;
	return ret;
    }

    public T removeLast(){
	T ret = last;
	
	if (size()==0) return null;
	else if (size()==1){

	    first=null;
	    end=null;
	}
	else if (size()==2){
	    last=first;
	}	
	else{
	    
	    last = new DLNode<T> (last.getBack().getBack(), last.getBack(), null);	    
	}

	size--;
	return ret;	
    }

    public T getFirst(){
	return first.getValue();
    }

    public T getLast(){
	return last.getValue();
    }

    public int size() return size;
	




}
