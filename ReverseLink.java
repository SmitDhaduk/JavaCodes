import java.util.LinkedList;

public class ReverseLink {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //Firstly, in this code i have written list and then 
        // i have used .descendingIterator function to reverse it. 
        LinkedList<Integer> lists = new LinkedList<Integer>();

       list.descendingIterator().forEachRemaining(lists::add);

       System.out.println(lists);
    }
}
