package arry1;
import java.util.Arrays;

public class sortArr {
    public static void main(String[] args) {

        int[] arr =  new int[] {10, 9, 8, 1};
//                new int[]
//        arr={10, 9, 8, 1};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.println(num + ",");
        }


        Arrays.sort(arr);

        System.out.println("Array.sort(arr)'s array:");
        for (int num : arr) {
            System.out.println(num + ",");


        }
    }
}