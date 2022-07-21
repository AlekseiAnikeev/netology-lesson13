/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 19.07.2022
 */
public class Main {
    public static void main(String[] args) {
        long[] sales = {19, 22, 312, 323, 25, 44};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальное значение продаж: " + salesManager.max());
    }
}
