import java.util.Scanner;

public class wasteCollection3 {

    // Method to calculate total waste
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        double total = point1Waste + point2Waste;
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read waste from the two collection points
        System.out.print("Enter waste collected at point 1: ");
        double point1Waste = input.nextDouble();

        System.out.print("Enter waste collected at point 2: ");
        double point2Waste = input.nextDouble();

        // Call the method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        // Display the result
        System.out.println("Total waste collected: " + totalWaste);

        input.close();
    }
}