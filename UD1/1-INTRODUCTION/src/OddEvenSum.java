public class OddEvenSum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0; // For accumulating odd numbers, init to 0

        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0 && number % 15 != 0 && number % 21 != 0 && number % 35 != 0 && number % 105 != 0) { 
                sum = sum + number;
                System.out.println(number);
                ++number;
            }
            
            else {
                ++number;
            }
            // Next number
        }
        // Print the result

        System.out.println("The sum is " + sum);
    }
}