package P_01_Array.P_01_BasicArray;
/*
    you are given an array prices where
    prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single
    day to buy one stock and choosing a different day
    in future to sell that stock.
    Return the maximum profit you can achieve
    from this transaction.
    If you cannot achieve any profit, return 0.

    prices={7,1,5,3,6,4}
    profit = selling price - buy price


        7😀
        6|              😀
        5|      😀
        4|                  😀
   SP   3|          😀
        2|
        1|   😀
        0|___________________________________
          0   1  2   3   4   5
                days

    where SP= Stock Price
    sellingprice=arr[i]
    buyPrice = Min value till date

    SP=7
    BP=7 (min price till date)
    profit = 0
    MaxProfit=0

    SP=1
    BP=1
    profit = 0
    MaxProfit=0

    SP=5
    BP=1
    profit = 4
    MaxProfit=4

    SP=3
    BP=1
    profit = 2
    MaxProfit=4

    SP=6
    BP=1
    profit = 5
    MaxProfit=5

    SP=4
    BP=1
    profit = 3
    MaxProfit=5
  */
public class C_09_BuySellStocks {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<arr.length;i++){
            int sellingPrice=arr[i];
            if(buyPrice<sellingPrice){
                int profit=sellingPrice-buyPrice;
                MaxProfit=Math.max(profit,MaxProfit);
            }
            else{
                buyPrice=sellingPrice;
            }
        }
        System.out.println(MaxProfit);
    }
}
