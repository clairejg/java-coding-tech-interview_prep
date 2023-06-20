package ContainerWithMostWater;
import java.util.*;

//public
class practice_solution2 {
//
//    public:
    public static int maxArea(Vector<Integer> height){
//        Vector is like the dynamic array which can grow or shrink its size
        int left = 0;
        int right = height.size() - 1;

        int max = 0;
//
        while(left < right){
            int w = right - left;
            int h = Math.min(height.get(left), height.get(right));
            int area = h * w;

            max = Math.max(max, area);
            //inbuit function in java which returs maximum number of two numbers

            if(height.get(left) < height.get(right)) left++;
            else if(height.get(left) > height.get(right)) right--;

            else {
                //when they r equal height
                left++;
                right--;
            }
        }
        System.out.println("Max: "+  max);

        return max;

    }

    public static void main(String[] args){
        System.out.println("Main() starts");
        Vector<Integer> userVect = new Vector<Integer>();
        //vector<Type> vectorObjName = new

//        userVect.add(userVal);
        System.out.println("The vector is: ");

        Scanner input = new Scanner(System.in);

        int userIntCount;
        int userInt;
        System.out.println("How many numbers of inputs do you wish to submit?: ");
        userIntCount = input.nextInt();

        System.out.println("userIntCount: " + userIntCount);

        for(int j=0; j<userIntCount; j++) {

            userInt = input.nextInt();
            userVect.add(userInt);
        }

        for(Integer item : userVect){
            System.out.print(item + ",");

        }

        int finalMax=0;
        finalMax= maxArea(userVect);
        System.out.println("Answer for final max area: " + finalMax);




    }
}
