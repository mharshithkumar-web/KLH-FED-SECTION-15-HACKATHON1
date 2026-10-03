
import java.util.Scanner;
public class wasteCollection1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Vehicle number :");
        int vehicle_number=sc.nextInt();
        System.out.println("give Waste collected in kilograms : "); 
        Double Waste_collected=sc.nextDouble();
        System.out.println("Give Vehicle status : ");
        char Vehicle_status =sc.next().charAt(0);

        System.out.println("Vehicle number is :"+vehicle_number);
        System.out.println("Waste collected in kilograms :"+Waste_collected);
        System.out.println("Vehicle Status is : "+Vehicle_status);
        sc.close();
    }
}
