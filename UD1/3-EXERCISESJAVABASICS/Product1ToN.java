public class Product1ToN {
public static void main(String[] args) {
    
    int product = 1;
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 10;
    for( int number = LOWERBOUND; number <= UPPERBOUND; number++) {
        product = product * number;

    }
System.out.println("The product for " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
}
}