/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 19.07.2022
 */
public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long averageCalculation() {
        long min = Integer.MAX_VALUE;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
            if (sale < min) {
                min = sale;
            }
        }
        return (sum - max() - min) / (sales.length - 2);
    }
}
