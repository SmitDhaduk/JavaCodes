import java.util.Scanner;

class BinarySearch {
              public static void main(String args[]){  
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the size of the array: ");
              int size = sc.nextInt();
              int arr[] = new int[size];
              System.out.println("Enter the values of the array: ");
              for(int i= 0;i<size;i++){
                arr[i]=sc.nextInt();
              }
               System.out.println("Choose the key values from the given array: ");
               int key = sc.nextInt();  
               int last = arr.length-1;  
               int first = 0;
               int mid = (first+last)/2;

              //  This code will search the index number of the key value using binary search.
              
               while(first<=last){
                 if(arr[mid]< key){
                    first = mid +1; 
                 }else if(arr[mid]==key){
                   System.out.println("Index of the value is: "+ mid);
                   break;
                 }else{
                   last = mid-1;
                 }
                 mid= (first+last)/2;

               }
               System.out.println("Index of the value is: "+ -1);
        }  
       
}
