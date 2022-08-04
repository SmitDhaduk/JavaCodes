import java.util.Scanner;

public class ReversStr {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String ogString = sc.nextLine();
        char ch;
        String revString="";

        // In this for loop,first I calculate the length of string then
        //  i reverse it and stored into char ch, 
        // then I stored all the charater into String revString.
        for(int i = 0; i<ogString.length();i++){
            ch = ogString.charAt(i);
            revString = ch+revString;

        }
        System.out.println("Your reverse String is "+revString);

    }
    
}
