import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----SORTING THREE NUMBERS-----\n");
        System.out.println("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("\nNumbers are already in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {

            if (num1 >= num2 && num1 >= num3) {
                if (num2 >= num3) {
                    System.out.println("\nNumbers rearranged in descending order: " + num1 + " " + num2 + " " + num3);
                } else {
                    System.out.println("\nNumbers rearranged in descending order: " + num1 + " " + num3 + " " + num2);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 >= num3) {
                    System.out.println("\nNumbers rearranged in descending order: " + num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println("\nNumbers rearranged in descending order: " + num2 + " " + num3 + " " + num1);
                }
            } else {
                if (num1 >= num2) {
                    System.out.println("\nNumbers rearranged in descending order: " + num3 + " " + num1 + " " + num2);
                } else {
                    System.out.println("\nNumbers rearranged in descending order: " + num3 + " " + num2 + " " + num1);
                }
            }
        }

        scanner.close();
    }
}
