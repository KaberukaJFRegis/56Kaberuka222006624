public class Nestedforloop {
    public static void main(String[] args) {
        String[] activities = {"wake up", "Breakfast", "Clean up", "Lunch", "Research+duties", "Messe", "Diner+prayer", "Sleeping"};
        String[] times = {"08:00", "09:00", "10:00", "12:00", "14:00", "17:00", "20:00", "21:00"};
        
        // Nested loop to print schedule
        for (int i = 0; i < activities.length; i++) {
            System.out.println("Time: " + times[i]);
            System.out.println("Activity: " + activities[i]);
            System.out.println("--------------------------");
 }
}
}