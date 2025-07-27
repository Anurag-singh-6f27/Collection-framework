package Dsa_Questions;

public class buyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit=0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i]<prices[i+1]){
                profit+=prices[i+1]-prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr={7};
        buyAndSellStock2 obj=new buyAndSellStock2();
        System.out.println(obj.maxProfit(arr));
    }
}
