public class ProfitCalculator {
    public static void main(String[] args) {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double percent = (profit * 100.0) / cp;
        System.out.printf("The Cost Price is INR %d and Selling Price is INR %d\nThe Profit is INR %d and the Profit Percentage is %.2f%%\n", cp, sp, profit, percent);
    }
}

