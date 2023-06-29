package leetArrayRemoveDuplicate1;

public class removeDuplicate {


    public static void main(String[] args){
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
                            //0,1,1,1,1,2,

       int k= removeDuplicates(arr);
       System.out.println("k:"+ k);

    }


//    given param:public int removeDuplicates(int[] arr)
    public static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int num: arr) {
            System.out.println(num + ",");
        }
        return i+1;
    }
}
//end


//*/
//    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//
//        Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
//        Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//        Return k.
//
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
//*/