public interface Deque<Q>{

    void addFirst(Q x);

    void addLast(Q x);

    Q removeFirst();

    Q removeLast();

    Q getFirst();

    Q getLast();


}
