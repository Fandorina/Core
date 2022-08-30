package hw.task1;

import java.util.Random;

/**
 * Task 1
 * @author Polina Fandorina
 */

public class Main {
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {

        int [][] myArray = new int[4][4];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j]=generateRandomIntIntRange(1,10);
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }

        int maximum = 0, minimum = 10, summa = 0, kolvo = 0, avg;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (minimum > myArray[i][j])
                {
                    minimum = myArray[i][j];
                }

                if (maximum < myArray[i][j])
                {
                    maximum = myArray[i][j];
                }

                summa += myArray[i][j];
                kolvo += 1;
            }

        }

        if (kolvo > 0) {
             avg = summa / kolvo;
        }
        else {
             avg = 0;
        }

         System.out.println("Min: "+minimum + " Max: "+maximum + " Average: "+avg);

    }
}
