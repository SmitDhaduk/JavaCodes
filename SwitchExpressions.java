public class SwitchExpressions {
    public static void main(String[] args) {
     
    int choice = 1;

    // Show example of switch expressions and multi-label case statements.
    
    int x = switch(choice){
    case 1,2,3:
        yield choice;
    default:
        yield -1;  
    };   
    System.out.println(x);   
    
    }
    
}
