package random;
public class Prog1 {
    public static void main(String[] args) {
        int zut1;
        double zut2;
        int zut3; //AiertenB
        int zut4; //Bitarra
        String zut5; //Txanpona
        int zut6; //Dadoa


        System.out.printf("%2s %23s %14s %14s %14s %14s \n","","Math.random()","AiertenB","Bitarra","Txanpona","Dadoa");
        System.out.printf("=======================================================\n");

        for (int i = 0; i <= 20; i++) {
            zut1 = i;
            zut2 = Math.random();

            if(zut2>=0.5){
                zut3 = 1;
                zut5 = "Gurutzea";
            }else{
                zut3=0;
                zut5 = "Aurpegia";
            }
            zut4 = (zut2>0.5) ? 1: 0;
            //zut5 = (int)(zut2 * 10);
            zut6 = (int)(zut2 * 6)+1;
            
             
            
            
            System.out.printf("%2d) %20.20f %12d %15d %15s %15d \n\n",zut1,zut2,zut3,zut4,zut5,zut6);
            
        }
    }
}
