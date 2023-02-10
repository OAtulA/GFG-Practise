import java.io.*;
import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) throws IOException {
        
        int[] arr = new int[5];
        for (int i = 1; i < 6; i++) {
            arr[i-1] = i;
        }
        System.out.println("Array: "+ Arrays.toString(arr));
        int[] arr2 = arr.clone();


        System.out.println("New array copied: "+ arr2);
        System.out.println("arr ==arr2: "+ (arr == arr2));

                

    }
}
