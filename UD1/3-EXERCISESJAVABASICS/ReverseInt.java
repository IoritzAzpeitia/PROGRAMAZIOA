import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        int a = 0;
        

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        inNumber = in.nextInt();
        in.close();
        
        while(inNumber>0){
            inDigit = inNumber % 10; //extrae el ultimo numero
            a = a * 10 + inDigit; //para que guarde el numero completo en otra variable  
            inNumber /= 10; 
        }
        System.out.print(a);

    }
}