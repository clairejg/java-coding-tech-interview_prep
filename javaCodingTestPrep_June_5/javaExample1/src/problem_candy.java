////import java.util.Scanner;
////
//import java.util.List;
//import java.util.ArrayList;
//import java.util.*;
////        리스트(List)는 두 개의 종류로 나눠진다.
//// 1)ArrayList -> 배열로 이루어진 리스트(List),
//// 2)LinkedList
//
//import java.util.Scanner;
// public class problem_candy {
//
//     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//       // a method must be declared within a class.
//        //static means that the method belongs to the Main class and not an object of the Main class
//
//
////        List<Boolean> resultList = new ArrayList();
//        //   List<Boolean> resultList = new ArrayList<>();
//         List<Boolean> resultList = new ArrayList<>(Collections.nCopies( candies.size(), false));
//
//        int greatestCandies = 0;
//
//        for (int i = 0; i < 5; i++) {
//            if (greatestCandies < candies[i]) {
//                greatestCandies = candies[i];
//            }
//        }
//
//
////        boolean[] result = new boolean[5];
////        int[] candiesArray=new int[5];
//        for (int j = 0; j < resultList.size(); j++) {
//            int totalCandies = candies[j] + extraCandies;
//
//            System.out.println("From kidsWithCandies(),");
//
//
////            resultList.add("element1");
//            if (totalCandies >= greatestCandies) {
//                resultList.set(j,true);
//
//            } else {
////                resultList.add(j,false);
//                resultList.set(j,false);
//
//
//
//            }
//        }
//
//         System.out.println("2)From kidsWithCandies(),");
//         System.out.println(resultList);
//
//         System.out.println(" end of kidsWithCandies()");
//
//        return resultList;
//    }
////}
//
////public class problem_candy {
//
//    public static void main(String[] args) {
//
////        problem_candy2 computeObj = new problem_candy2();
//        int extraCandies = 3;
//
//        List candiesList = new ArrayList();
//        System.out.println("Enter N integer for int[] candies ");
//        Scanner myObj = new Scanner(System.in);
//        int userInt = input.nextInt();
//                candiesList.Listadd(userInt);
//        System.out.println(candiesList);
//
//
//
//        List<Boolean> result2 = new ArrayList<>();
//                result2 = kidsWithCandies(candiesArray, extraCandies);
//
//        System.out.println(result2);
//
//
//        System.out.println("user candies[] is: ");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(candiesArray[i] + ",");
//
//        }
//    }// main ends
////end
//}
//
////Input: candies = [2,3,5,1,3], extraCandies = 3
////        Output: [true,true,true,false,true]
