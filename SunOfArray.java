import java.util.Scanner;

public class SunOfArray {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the value of the array: ");
        for(int i = 0 ; i<size; i++){
            arr[i]= sc.nextInt();
        }
        // This code will give output of sum of the given array.
        for(int i = 0 ; i<size; i++){
            sum= sum+arr[i];
        }
        System.out.println("Sum of the array is: "+sum);
    }
}
