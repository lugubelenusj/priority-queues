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
            return 0;
        }
        int elem = array[head];
        head = (head + 1) % size;
        return elem;
    }

    public int insert(int elem) {
        if (((tail+1)%size) == head) {
            doubleArray();
        }

        int current = head;
        while (elem > array[current] && current < size-1 && array[current] != 0) {
            current++;
        }

        shiftRight(current);
        array[current] = elem;
        tail = (tail + 1) % size;

        return 1;
    }

    private void doubleArray() {
        size *= 2;
        int[] newArray = new int[size];
        for (int i = 0; i < size/2; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private void shiftRight(int start) {
        int[] newArray = new int[size+1];
        for (int i = 0; i < start; i++) {
            newArray[i] = array[i];
        }
        for (int i = start; i < size; i++) {
            newArray[i+1] = array[i];
        }
        array = newArray;
    }

    public void print() {
        for (int num : array) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

}