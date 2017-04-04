public class ListPriorityQueue implements PriorityQueue {

    private int[] array;
    private int head;
    private int tail;
    private int size;

    public ListPriorityQueue(int size) {
        this.array = new int[size + 1];
        this.head = 0;
        this.tail = 0;
        this.size = size + 1;
    }

    public int removeSmallest() {
        if (head == tail) {
            return null;
        }
        int elem = array[head];
        head = (head + 1) % size;
        return elem;
    }

    public int insert(int elem) {
        array[tail] = elem;
        tail = (tail + 1) % size;
    }

}