package lasha_chubinidze_1.quiz1.t3;

public class CoffeeShop {
    int pricePerCoffee = 250;
    int numCoffeeSold = 100;
    int totalCostOfBeans = 15000;

    int tax = 5100;
    int water = 75;
    int gas = 159;
    int electricity = 14800;
    int parking = 5100;

    int otherExpenses = tax + water + gas + electricity + parking;
    int totalExpenses = totalCostOfBeans + otherExpenses;

    double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        int totalRevenue = pricePerCoffee * numCoffeeSold;
        int totalExpenses = totalCostOfBeans + otherExpenses;

        double profitInLaris = (totalRevenue - totalExpenses) / 100.0;
        return profitInLaris;
    }

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        System.out.println("Total Profit: " + shop.profit + " Lari");
    }
}
