public class SumAverageRunningInt { // Save as "SumAverageRunningInt.java"
   public static void main(String[] args) {

      int sum = 0;
      double count = 0;
      double average;
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {

         sum += number;
         count++;
      }

      System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
      average = sum / count;
      System.out.println("The average is " + average);

   }
}
