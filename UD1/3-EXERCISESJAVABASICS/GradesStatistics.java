import java.util.Scanner;

/*Write a program which prompts user for the number of students in a class (a non-negative integer), and saves it in an int variable called numStudents. It then prompts user for the grade of each of the students (integer between 0 to 100) and saves them in an int array called grades. The program shall then compute and print the average (in double rounded to 2 decimal places) and minimum/maximum (in int). */
public class GradesStatistics {
    public static void main(String[] args) {

        final int NUM_ITEMS;
        int[] grades;
        int sum;
        double average;
        int min;
        int max;
         
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of students: ");
        NUM_ITEMS = in.nextInt();   
        grades = new int[NUM_ITEMS];

        
        for ( int i = 0; i < grades.length; i++){
            System.out.println("Enter the grade " + (i + 1) + ": ");
            grades[i] = in.nextInt();
                
        }            
        in.close();    

        sum = 0;
        for ( int i = 0; i < grades.length; i++){
        sum = sum + grades[i] ;
        }
        average = sum/(double)NUM_ITEMS;

        System.out.printf("The average is: %.2f" , average);

        min = grades[0];
        in.close();

        }
        
    }

