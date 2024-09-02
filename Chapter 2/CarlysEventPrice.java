import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        
        System.out.println("****************************************");
        System.out.println("* Carly's makes the food that makes   *");
        System.out.println("*               it a party             *");
        System.out.println("****************************************");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of guests: ");
        int numGuest = input.nextInt();
        
        int pricePerGuest = 35;
        int totalPrice = pricePerGuest * numGuest;
        
        System.out.println("\nNumber of Guests: " + numGuest);
        System.out.println("Price per Guest: $35");
        System.out.println("The total price: $" + totalPrice);
        
        if (numGuest >= 50) {
            System.out.println("\nIs it a large event? True");
        } else {
            System.out.println("\nIs it a large event? False");
        }
        
        input.close();
    }
}
