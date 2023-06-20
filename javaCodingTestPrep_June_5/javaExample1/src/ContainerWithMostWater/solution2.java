package ContainerWithMostWater;
import java.util.*;

class solution2 {
    int elem;
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;

            max = Math.max(max, area);
            //inbuit function in java which returs maximum number of two numbers

            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;

            else {
                //when they r equal height
                left++;
                right--;
            }
        }
        System.out.println("Max: "+  max);

        return max;


        }



        public static void main(String[] args) {
            System.out.println("Main() start");

            //1.Error:
//            List heightArray = new ArrayList<>();
//            Scanner input= new Scanner(System.in);
//            int userInt = input.nextInt();
//            heightArray.add(userInt);
//            int finalMaxArea= maxArea(heightArray);


//            error2:e4d
//            int[] arrayHeight = new int[9];
//            arrayHeight={1,8,6,2,5,4,8,3,7};
//[1,8,6,2,5,4,8,3,7]
            int[] arrayHeight= new int[]{1,8,6,2,5,4,8,3,7};
            for(int item: arrayHeight)
            {

//                arrayHeight[i];
                System.out.println("elem: " + item);

            }

            int finalMax=0;
                  finalMax  = maxArea(arrayHeight);

             System.out.println("Answer for final max area: " + finalMax);
        }

    //ERROR NOTE Begins:
    // 1.java.util.List cannot be converted to int[]
    // ex)
    // when function header looks like this,  ....//publinc int maxArea(int[] heightArray) ...
    // the function call cannot be this: maxArea(ArrayList), because we cannot not pass 'ArrayList' parameter' as 'Array of integer'

}


//problem :
//You are given an integer array height of length n.
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//        Return the maximum amount of water a container can store.
//        Notice that you may not slant the container.

//class Solution {
//    public:
//    int maxArea(vector<int>& height) {
//
//    }
//};

//        Example 1:
//
//        Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49
//        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.