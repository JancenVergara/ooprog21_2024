import java.util.Scanner;

public class SpoonerismGenerator {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("Enter First word: ");
      String word1 = scanner.next();
      System.out.print("Enter Second word: ");
      String word2 = scanner.next();
   
      System.out.println("Result: " + spoonerize(word1, word2));
   }

   public static String spoonerize(String word1, String word2) {
      String part1 = getConsonantCluster(word1);
      String part2 = getConsonantCluster(word2);
   
      if (part1.isEmpty() || part2.isEmpty()) {
         return "ERROR! One or both words can't be spoonerized.";
      }
   
      return part2 + word1.substring(part1.length()) + " " + part1 + word2.substring(part2.length());
   }

   public static String getConsonantCluster(String word) {
      int vowelIndex = findFirstVowel(word);
      return vowelIndex == -1 ? "" : word.substring(0, vowelIndex);
   }

   public static int findFirstVowel(String word) {
      for (int i = 0; i < word.length(); i++) {
         if ("aeiouAEIOU".indexOf(word.charAt(i)) != -1) {
            return i;
         }
      }
      return -1;
   }
}