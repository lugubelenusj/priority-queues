public class Test {

    public static void main(String[] args) {

        ListPriorityQueue list = new ListPriorityQueue(1);
        list.insert(0);
        list.insert(6);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(9);
        list.insert(7);
        list.insert(8);
        list.insert(10);
        list.insert(1);
        list.insert(5);
        list.insert(0);

        // list.insert(5);
        // list.insert(4);
        // list.insert(3);
        // list.insert(2);
        // list.insert(1);

        list.print();

        System.out.println(list.removeSmallest());
        System.out.println(list.removeSmallest());
        System.out.println(list.removeSmallest());
        System.out.println(list.removeSmallest());
        System.out.println(list.removeSmallest());
        System.out.println(list.removeSmallest());
        System.out.println(list.removeSmallest());
    }

}