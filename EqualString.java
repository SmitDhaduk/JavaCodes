import java.util.Scanner;

import javax.naming.ldap.SortKey;

public class EqualString {
    
    public static void main(String[] args){
        String input="";
        Scanner sc= new Scanner(System.in);
        //here if user write "quit" then program will end  otherwise it will keep runing.
        while(!input.toLowerCase().equals("quit")){
            System.out.println("Input: ");
            input = sc.nextLine();
            System.out.println("Your entered output is "+input);
        }
    }
}
