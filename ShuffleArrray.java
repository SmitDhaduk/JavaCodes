import java.util.Random;
import java.util.Arrays;

class ShuffleArray{
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        Random rand = new Random();
        // This code will show random numbers in array.

        for(int i = 0; i<arr.length;i++){
            
            int swap = rand.nextInt(arr.length);
            int temp = arr[swap];
            arr[swap]=arr[i];
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}