//Jeffrey Weng
//APCS2 - pd3
//Hw29 -- Stress is the Best
//2017-4-4

import java.util.Iterator;

public class DequeTester<T>{

    public static void main(String[] args){
	Deque<String> DeT = new ALDeque<String>();

	  
	System.out.println("\nnow printing out queue..."); 
	System.out.println( DeT ); //for testing toString()...



	System.out.println("\nnow adding nine times...");
	//Tests addLast, adds the specified element at the end of the queue
	DeT.addLast("Lord");
	DeT.addLast("War");
	DeT.addLast("Peace");
	DeT.addLast("hello");
	DeT.addLast("from");
	DeT.addLast("other");
	DeT.addLast("Side");

	// testing add, adds the specified element into the queue, returns true if successful, ArrayLists don't have capacities
	DeT.add("newItem");
	System.out.println("\nadding to the front");
	//testing addFirst, adds specified element at the front of the deque
	DeT.addFirst("frontItem");

	System.out.println("\nnow printing out queue..."); 
	System.out.println( DeT ); //for testing toString()...

	//Tests contains, returns true if the value is in the arrayList
	System.out.println("\nchecking contains method");
	System.out.print("Contains War?: ");
	System.out.println( DeT.contains("War")); // returns true
	System.out.print("Contains fool?: ");
	System.out.println( DeT.contains("fool")); // returns false

	
	System.out.println("\nTest descendingIterator, Returns iterator");
	System.out.println(DeT.descendingIterator()); //returns the iterator

	System.out.println("\nUsing descendingIterator");
	for(Iterator itr = DeT.descendingIterator(); itr.hasNext();){
	    System.out.print(itr.next() + ", "); // prints out the queue elements in reverse order
	}

	System.out.println("Tests element, Retrieves the head of the queue");
	System.out.println(DeT.element()); //returns Lord
	System.out.println("Tests getFirst, retrieves the first element of the queue");
	System.out.println(DeT.getFirst()); // returns Lord
	System.out.println("Tests getLast, retrieves the last element of the queue");
	System.out.println(DeT.getLast()); //returns Side


	System.out.println("\nTests Iterator");
	System.out.println(DeT);	
	System.out.println(DeT.iterator()); // returns the iterator
	for(Iterator itr = DeT.iterator(); itr.hasNext();){
	    System.out.print(itr.next() + ", "); // prints out the queue elements in proper order
	}
	
	
	System.out.println("Testing offer");
	System.out.println(DeT.offer("newThing"));
	
	System.out.println("testing offerFirst");	
	System.out.println(DeT.offerFirst("anotherNewThing"));
	
	System.out.println("testing offerLast");
	System.out.println(DeT.offerLast("offerLastThing"));
	
	System.out.println(DeT);
	

	System.out.println("Peeking Front and end");
	System.out.println(DeT.peekFirst()); // returns anotherNewThing
	System.out.println(DeT.peekLast()); //returns offerLastThing

	System.out.println("Returning and removing front and end");
	System.out.println(DeT.pollFirst()); //returns anotherNewThing
	System.out.println(DeT.pollLast());//return offerLastThing

	System.out.println("Peeking Front and end");
	System.out.println(DeT.peekFirst());//returns Lord
	System.out.println(DeT.peekLast()); //newthing
	
	System.out.println(DeT);
	
	System.out.println("Testing peek, Retrieves the front of the Deque");
	System.out.println(DeT.peek()); //returns Lord

	System.out.println("Testing poll, Removing the front and returning it");
	System.out.println(DeT.poll()); //returns newthing

	System.out.println("Testing pop, Removes the end of the queue and returns it");
	System.out.println(DeT.pop()); //returns Side

	System.out.println("WARNING ONLY FOR STACKS");
	System.out.print("Successful: ");
	System.out.println(DeT.push("stackpush"));

	System.out.println("Testing remove, Removing...the head");
	System.out.println(DeT.remove()); //returns Lord

	System.out.println("Testing removeFirst, Removing... the head");
	System.out.println(DeT.removeFirst()); //returns War

	System.out.println("Testing removeLast, Removing... the end");
	System.out.println(DeT.removeLast()); //Returns other

	System.out.println(Det);

	
	System.out.println("\nnow adding seven times..."); 
	DeT.addLast("a");
	DeT.addLast("b");
	DeT.addLast("a");
	DeT.addLast("d");
	DeT.addLast("e");
	DeT.addLast("f");
	DeT.addLast("a");

	System.out.println("removing the first occurence in the deque");
	System.out.print("returns true/false if removed: ");
	System.out.println(DeT.removeFirstOccurrence("a")); // returns true

	System.out.println("removing the last occurence in the deque");
	System.out.print("returns true/false if removed: ");
	System.out.println(DeT.removeLastOccurrence("a")); // returns true
	

	System.out.println("\nnow dequeuing five times...from the end.."); 
	System.out.println( DeT.pollLast());
	System.out.println( DeT.pollLast());
	System.out.println( DeT.pollLast());
	System.out.println(DeT.pollLast());
	System.out.println(DeT.pollLast());

	System.out.println("Testing Exceptions and conditions where the queue is empty");
	System.out.println("\nDequeuing from empty queue should yield null...");
	System.out.println( DeT.pollLast() );
	System.out.println(DeT.pollFirst());
	System.out.println("isEmpty should return true");
	System.out.println(DeT.isEmpty());
	System.out.println("Peeking should return null");
	System.out.println(DeT.peek());
	System.out.println(DeT.peekFirst());
	System.out.println(DeT.peekLast());
	



	

	
	
	
    }


}




    
