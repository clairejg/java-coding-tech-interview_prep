package leetArray2;

public class BestTimeToBuyStock {
    public static void main(String[] args){
        int[] stockArr = new int[] {7,1,5,3,6,4};
//                {7,1,5,3,6,4} output:7, [7,6,4,3,1] Output: 0
        int maxStockProfit =maxProfit(stockArr);
        System.out.println("max Stock Profit: " + maxStockProfit);
    }
    public static int maxProfit(int[] prices){
        int maxTotal=0;
        //iterate through our array, from the second element.
        for(int i =1; i<prices.length; i++){
            if(prices[i]> prices[i-1]){
                //as long as the current array value is > than the previous array element,
                // we add the difference to the current total. The value of Max is being added when conditoin meets
                maxTotal= maxTotal+ prices[i]- prices[i-1];
                System.out.println("i:"+ i +","+(i-1)+ "th" +" maxTotal:"+ maxTotal);
            // if( 4 > 3){ maxTotal = 1+1+1 ==3.
            }
        }

        return maxTotal;

    }

}

//for this approach, we need to keep track of 'total'
//The time complexity is 'the Big O of n' because(=as),
//we traversed the array only once.
//*/
//    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//        Find and return the maximum profit you can achieve.
//
//
//
//        Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 7
//        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//        Total profit is 4 + 3 = 7.