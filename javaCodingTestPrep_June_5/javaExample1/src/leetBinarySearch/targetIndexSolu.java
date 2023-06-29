//package leetBinarySearch;
//
//public class targetIndexSolu {
//
//    public int searchInsert(int[] nums, int target){
//        int pivot=0;
//        int left=0;
//        int right = nums.length-1;
//
//        // 1 2 3 6 7 ,, target is 5
//
//        while(left <= right) {
//            pivot = left + (right - left) / 2;
//          //???  OR  int mid=(st+end)/2;
//            // 1.p= 4/2=2m
//            //2. p= 3+ (4-3)/2..
//
//            if (nums[pivot] == target) {
//                //1. '3' ==target
//                return pivot; // when the 'sums[pivot]' has is the target value
//                //we return the index.
//            }
//
//            if (target < nums[pivot]) {
//                //
//                right = pivot - 1; // because the 'target' is going to be in the left side of pivot.
//                // so we are updating the 'right'
//            }
//
//            if (target > nums[pivot]) {
//                //1. left = 2+1=3
//                left = pivot + 1;
//                // left =
//            }
//            return left;
//        }
//
//
//
//
//
//        }
//
//
//
//
//    }
//}
