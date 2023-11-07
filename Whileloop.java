public class Whileloop {
    public static void main(String[] args) {
        int totalExercises = 5;
        int exercisesCompleted = 0;
        
        System.out.println("Let's start the exercise routine!");
        
        while (exercisesCompleted < totalExercises) {
            exercisesCompleted++;
            System.out.println("Exercise " + exercisesCompleted + ": Complete!");
        }
        
        System.out.println("Congratulations! You've completed the exercise routine.");
}
}