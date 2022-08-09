import java.util.Arrays;
import java.util.Scanner;

class ArraySameElement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter elements of first array:");
        for(int i = 0; i<size;i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for(int j = 0; j<size;j++){
            array2[j] = sc.nextInt();
        }
        // In this code i have write that, if given arrays have same values or not.
        boolean ans = Arrays.equals(array1,array2);
        System.out.println(ans);
    }
}