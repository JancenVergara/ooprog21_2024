public class Fibonacci {
 
  public static void main(String[] args) {  

    int n = 13, firstNum = 0, secondNum = 1;
    System.out.println("Fibonacci (0) " + n + " Number:");

    for (int i = 0; i <= n; ++i) {
      System.out.print(firstNum + "\n");

      int nextNum = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = nextNum;
    }
  }
}
