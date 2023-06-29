package leetString1;
//
//Write a function that reverses a string. The input string is given as an array of characters s.
//
//        You must do this by modifying the input array in-place with O(1) extra memory.
//
//
//
//        Example 1:
//
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]

//class Solution {
//    public void reverseString(char[] s) {
//
//    }
//}

public class reverseString {

    public static void main (String arg[]){
         //make sure to create char []
        char[] stringArr = new char[] {'h','e','l','l','o'};
        System.out.println("Original Array:");

        for(char item: stringArr){
            System.out.println(item);
        }

        reverseString(stringArr);
        System.out.println("Reversed Array:");
        for(char item: stringArr){
            System.out.println(item);
        }
    }
    public static void reverseString(char[] s) {
        int left=0;
        int right= s.length-1;

        while(left<right){
            char temp= s[left];
            s[left]=s[right];
            left++;
            s[right]=temp;
            right--;
        }
    }
}
