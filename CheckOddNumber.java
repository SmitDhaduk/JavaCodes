import java.util.Scanner;

import javax.xml.transform.Source;

public class CheckOddNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enrter the array values: ");

        for(int i = 0 ; i<size; i++){
            array[i] =sc.nextInt();
        }
        // This code will find out even numbers from the array using for loop.
        for(int i=0;i<size;i++){


            if(array[i]%2==0){
                System.out.println(array[i]+" is the even Number");
            }
        } 
    }
    
}
