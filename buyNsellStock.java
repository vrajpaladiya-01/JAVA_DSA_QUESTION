public class buyNsellStock {
    public static int BuyANDSellStocks(int prices[]){
        int BuyingPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(BuyingPrice < prices[i]){
                int profit = prices[i] - BuyingPrice;
                
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                BuyingPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(BuyANDSellStocks(prices));
    }
}
