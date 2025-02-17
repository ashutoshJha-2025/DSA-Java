public class BuyorSell {
   public static void main(String[] args) {
    // DAY :-      1,2,3,4,5,6
    int[] prices = {7,6,4,3,1};
    System.out.println(maxProfit(prices));
   }

   public static int maxProfit(int[] prices) {
        int buyprice = prices[0];
      //int currentprofit = 0;
        int Profit = 0;

        for(int i=1; i<prices.length; i++) {
         if(prices[i] < buyprice) {
            buyprice = prices[i];
         } else {
            int currentprofit = prices[i] - buyprice;
            Profit = Math.max(currentprofit, Profit);
         }
        }
        return Profit;
   }
}