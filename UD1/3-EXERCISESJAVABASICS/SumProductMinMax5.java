import java.util.Scanner;
public class SumProductMinMax5 {
    public static void main(String[] args) {

        int num1, num2, num3, num4, num5, sum, product, min, max;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = in.nextInt();
        System.out.println("Enter second number: ");
        num2 = in.nextInt();
        System.out.println("Enter third number: ");
        num3 = in.nextInt();
        System.out.println("Enter forth number: ");
        num4 = in.nextInt();
        System.out.println("Enter fifth number: ");
        num5 = in.nextInt();
        in.close();

        sum = num1 + num2 + num3 +num4 + num5;     
        System.out.println("The sum is " + sum);

        product = num1 * num2 * num3 * num4 * num5;
        System.out.println("The product is " + product);

        min = num1;

        if(min > num2){
            min = num2 ;}

        if(min > num3){
            min = num3;}
                 
    
        if(min > num4){
        min = num4;}
            

        if(min > num5){
        min = num5;}
                System.out.println("The min is " + min);

        max = num1;

        if(max < num2){
            max = num2;}

        if(max < num3){
            max = num3;}
                
        if(max < num4){
        max = num4;}
           

        if(max < num5){
        max = num5;}
                System.out.println("The max is " + max);
        }
    }

