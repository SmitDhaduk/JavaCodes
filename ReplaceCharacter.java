import java.util.Scanner;

class ReplaceCharacter{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();

        System.out.println("Choose any one character from the above to replace: ");
        char ch = sc.next().charAt(0);

        System.out.println("Write  any one character for replacement: ");
        char ch1 = sc.next().charAt(0);

        // This code will replace character from the given String.
        String newStr = str.replace(ch,ch1);
        System.out.println(newStr);

    }
}