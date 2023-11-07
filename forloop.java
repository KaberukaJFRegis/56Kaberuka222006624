public class forloop {
    public static void main(String[] args) {
        String[] items = {"watch", "laptop", "phone", "airpods"};
        double[] prices = {50.0, 500.0, 250.0, 50.0};
        
        double totalCost = 0.0;
        
        // Loop to calculate total cost
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + ": $" + prices[i]);
            totalCost += prices[i];
        }
        
        System.out.println("--------------------------");
        System.out.println("Total cost: $" + totalCost);
}
}