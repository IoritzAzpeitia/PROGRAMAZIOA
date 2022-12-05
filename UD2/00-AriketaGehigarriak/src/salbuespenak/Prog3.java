package salbuespenak;
import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        int [] zenbakiak ={1, 15, 2};
        try {
            System.out.println(zenbakiak[3]);
            System.out.println("Gaur markatze");
        } catch (Exception e1) {
           System.out.println("Salbuespena gertatu da.");
           System.out.println(e1.getMessage());
           System.out.println(e1.getClass());
        }
    }
}
