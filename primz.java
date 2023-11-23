package Attila;

import java.awt.desktop.SystemEventListener;

public class primz {
    ;

    public static void main(String[] args) {
        String Primenumbers = "";
        int i = 0;
        int num = 0;
        int totalCount = 0;
        String lastnumber= "";


        


        for (i = 0; i < 1000; i++) {
            int counter = 0;


            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter +=  1;

                }
            }
            if ( totalCount == 50)
                break;
            if (counter == 2) {

                Primenumbers = Primenumbers + i + " ";
                totalCount++;
            if(totalCount == 50){
                lastnumber = lastnumber + i + " ";


            }





            }

        }
        System.out.println(Primenumbers);
        System.out.println("anzahl der Primzahlen sind : " +totalCount);
        System.out.println("letzter Primzahl ist ="+lastnumber);
    }
}
