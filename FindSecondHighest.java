import java.util.Scanner;

public class FindSecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements of first array:");
        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        // In this code, i have written that it will give output of the second highest value from the array.
        for(int i = 0 ; i<size;i++){
                if(arr[i]>max){
                    secMax =max;
                    max = arr[i];
                }else if(arr[i]>secMax){
                    secMax =arr[i];
                }
        }
        System.out.println("Second highest is "+secMax);



    }
    
}
