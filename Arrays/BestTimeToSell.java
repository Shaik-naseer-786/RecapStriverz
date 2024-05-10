public class BestTimeToSell {
    public static int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for (int i : prices) {
            min=Math.min(min,i);
            max=Math.max(max,i-min);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
