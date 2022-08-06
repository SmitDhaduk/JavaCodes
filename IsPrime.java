import java.util.Scanner;

import javax.xml.transform.Source;

public class IsPrime {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter any number to check number is prime or not");
        int num = sc.nextInt();

        boolean anser = true;
        if(num<=1){
            System.out.println("It's a prime number");
        }else{
        // In this code,user will enter any number and it shows that the number is prime or not.
        for(int i = 2; i<=num/2; i++){
            if(num%2==0){
                anser = false;
            }
        }
        if(!anser){
            System.out.println("It's not a prime number");
        }else{
            System.out.println("It's a prime number");
        }
        }
    }
    
}
