public class ThreeFiveSevenSum{  
   public static void main(String[] args) {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 1000;
      int sum  = 0;    

      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         
         if ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0) && number % 15 != 0 && number % 21 != 0 && number % 35 != 0 && number % 105 != 0) { 
            sum = sum + number;

        System.out.println(number);
         ++number;
         } else {               
           ++number; 
         }
     
      } 
      System.out.println("The sum of integred numbers from " + LOWERBOUND + " to " + UPPERBOUND + "  is " + sum);
    }
}