import java.sql.Date;
import java.util.*;

import javax.xml.transform.Source;

public class  FizzBuzz{

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num = sc.nextInt();

        //if youser enter any value which is  muliple of 3 and 5 then it will show "FizzBuzz".
        if(num%5==0 && num%3==0)
        {
            System.out.println("FizzBuzz");
        }

        //if youser enter any value which is  muliple of 5 then it will show "Fizz".
        else if(num%5==0 ){
            System.out.println("Fizz");
        }
        //if youser enter any value which is  muliple of 3 then it will show "Buzz".
        else if(num%3==0){
            System.out.println("Buzz");
        } else{
        System.out.println(num);
    }
 }
}
