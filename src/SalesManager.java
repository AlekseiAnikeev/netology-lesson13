/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 19.07.2022
 */
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int averageCalculation(int[] sales) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
            if (sale < min) {
                min = sale;
            }
        }
        return (sum - max() - min) / (sales.length - 2);
    }
}
