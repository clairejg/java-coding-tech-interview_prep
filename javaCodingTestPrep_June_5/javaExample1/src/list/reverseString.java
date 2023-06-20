
//package list;
//import array;

//import java.util.*;
public class reverseString {
    public static void main(String[] args) {
//        char[] stringArr= new char;
        char[] Arr = {'h', 'a', 'p', 'i', 'y'};
        int left = 0;
        int right = Arr.length - 1;

        while (left < right) {
            char temp;
                    temp = Arr[left];
            Arr[left++] = Arr[right];
            Arr[right--] = temp;

        }
        for (char i : Arr) {
            System.out.println(i);
        }


    }
}



//    Write a function that reverses a string. The input string is given as an array of characters s.
//
//        You must do this by modifying the input array in-place with O(1) extra memory.
//
//
//
//        Example 1:
//
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]