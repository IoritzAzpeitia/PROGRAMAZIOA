
public class PrintLeapYears {
    public static void main(String[] args) {
        final int LOWERBOUND = 999;
        final int UPPERBOUND = 2010;
        int count = 0;

        int  year = LOWERBOUND;
        while (year <= UPPERBOUND) {

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 100 == 0 && year % 400 == 0)){ 
                ++count;
                System.out.println(year);
                ++year;
            } else {
                ++year;
            }
        }
        System.out.println("The number of leap years between " + LOWERBOUND + " and " + UPPERBOUND + " is " + count);
    }
}