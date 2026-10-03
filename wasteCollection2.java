

import java.util.Scanner;
public class wasteCollection2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give waste collected in kilograms : ");
        int waste_Collected =sc.nextInt();

        if (waste_Collected>=100){
            System.out.println("Collection Target Achieved");
        }
        else{
            System.out.println("More Waste Collection Required");
        }
        sc.close();
    }
}
