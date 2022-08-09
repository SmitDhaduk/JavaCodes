import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoList {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<String> list1 = new ArrayList<String>();
        System.out.println("Enter any frist String: ");
        list1.add(sc.nextLine());

        List<String> list2 = new ArrayList<String>();
        System.out.println("Enter any second String: ");
        list1.add(sc.nextLine());

        // This code will merge two List.

        List<String> mergeList = new ArrayList<String>(list1);
        mergeList.addAll(list2);
        System.out.println("Merge strings are :"+mergeList);



    }
    
}
