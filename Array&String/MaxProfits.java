package ArrayAndString;

public class MaxProfits {
    public int maxProfits(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int mp = 0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                mp = Math.max(prices[i]-minPrice,mp);
            }
        }
        return mp;
    }
}
