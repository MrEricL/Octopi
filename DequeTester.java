/*~~~~~~~~~~~
  Yuanchu Liu (Leo)
  APCS2 pd 3
  hw29 -- Stress is the Best
  2017-04-04
  ~~~~~~~~~~~ */

public class DequeTester{
    public static void main(String[] args){

	/* ~~~~~~~~~ Basic operations */
	DLLDeque ada = new DLLDeque();
	ada.addFirst("Bob");
	ada.addFirst("Cal");
	ada.addLast("Tim");
	ada.addLast("Zoe");
	System.out.println(ada.removeFirst());//Cal
	System.out.println(ada.removeLast());//Zoe
	System.out.println(ada.getFirst());//Bob
	System.out.println(ada.getLast());//Tim


	
	/* ~~~~~~~~~ Robustness Test of toString
	   Should print 9 8 7 6 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 0 9 8 7 6 5 4 3 2 1 0
	   Checks if your Deque can have Deques
	   ~~~~~~~~~ */
	Deque OfWhat = new DLLDeque();
	Deque FromWhat = new DLLDeque();
	Deque BelongToWhat = new DLLDeque();
	
	for(int i = 0; i < 10; i ++){
	    OfWhat.addFirst(i);
	    FromWhat.addFirst(i);
	    BelongToWhat.addFirst(i);
	}

	Deque<Deque> HeheXD = new DLLDeque();
	HeheXD.addFirst(OfWhat);
	HeheXD.addFirst(FromWhat);
	HeheXD.addFirst(BelongToWhat);
	System.out.println(HeheXD);

    }
}
