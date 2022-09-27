public class PrintNumberInWord {   
   public static void main(String[] args) {
      int number = 2;  
 
      
      if (number == 1) {   
         System.out.println( "ONE" );
      } else if ( number == 2 ) {
        System.out.println( "TWO" );
      } else if ( number == 3 ) {
        System.out.println( "THREE" );
    
      } else {
        System.out.println( "OTHER" );

      }
 
    
      switch(number) {
         case 1: 
            System.out.println( "ONE" ); break; 
         case 2: 
            System.out.println( "TWO" ); break;
        case 3: 
        System.out.println("THREE" ); break;
         default: System.out.println( "OTHER" ); 
      }
   }
}