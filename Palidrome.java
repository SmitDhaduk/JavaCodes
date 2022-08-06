import java.util.Scanner;

public class Palidrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");

        String str = sc.nextLine();
        String nstr = "";
        char ch;
        // In this code, user will enter any string and it will show that the string is palidrome or not.
        for(int i =0; i<str.length();i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        if(str.equals(nstr)){
        System.out.println("Given string is palidrome.");
    }
    else{
        System.out.println("Given string is not palidrome.");
    }

    }
    
}
