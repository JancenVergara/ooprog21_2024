import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
    
        int rentPerHour = 40;
        int perAddMinute = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.print("\nEnter the number of minutes rented: ");
        int totalMinutes = input.nextInt();

        int minToHour = totalMinutes / 60;
        int additionalMinutes = totalMinutes % 60;

        double totalPrice;
        if (totalMinutes < 60) {
            totalPrice = rentPerHour;
        } else {
            totalPrice = (minToHour * rentPerHour) + (additionalMinutes * perAddMinute);
        }

        System.out.println("\nNumber of Minutes: " + totalMinutes);
        System.out.println("Hours: " + minToHour);

        if (totalMinutes < 60) {
            System.out.println("Additional minutes: 0");
        } else {
            System.out.println("Additional minutes: " + additionalMinutes);
        }

        System.out.println("Total price: $" + totalPrice);

        input.close();
    }
}