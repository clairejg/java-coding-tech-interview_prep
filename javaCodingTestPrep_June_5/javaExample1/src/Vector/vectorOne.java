package Vector;

import java.util.Scanner;
import java.util.Vector;

public class vectorOne {
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




    }


}
