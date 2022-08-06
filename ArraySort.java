import java.util.Arrays;
import java.util.Scanner;

public class ArraySort{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        // this code will sort the array.
        System.out.println("Enter the values of the arrays: ");
        for(int i = 0 ; i<size;i++){
           array[i]= sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted array values are: ");

        for(int i= 0 ; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}