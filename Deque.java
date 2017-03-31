public interface Deque<Q>{

    public void addFirst(Q x);

    public void addLast(Q x);

    public Q removeFirst();

    public Q removeLast();

    public Q getFirst();

    public Q getLast();

    public int size();


}
