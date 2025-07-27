package Dsa_Questions;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int low=Integer.MAX_VALUE;
        int maxprize=Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
             low=Math.min(prices[i],low);
             maxprize=Math.max(maxprize,prices[i]-low);
        }
        return maxprize;
    }

    public static void main(String[] args) {
        BuyAndSellStock buy=new BuyAndSellStock();
        int []arr={7,6,4,3,2,14,1};
        System.out.println(buy.maxProfit(arr));
    }
}
