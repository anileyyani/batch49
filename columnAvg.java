import java.util.Scanner;

public class columnAvg {

    public static void main(String[] args) {

        //************* Create an array of 2d with 3 rows and 2 column and get the average of each column   ********//
        boolean flg = true;
        int[][] avgAry = new int[3][5];
        Float avg = 0.0f;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                avgAry[i][j] = (int) (Math.random() * 100);
                System.out.print(avgAry[i][j] + "\t\t");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("-".repeat(60));
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                avg += avgAry[i][j];
            }
            System.out.print(Math.round(avg = avg / 3) + "\t\t");

        }
        System.out.println();
        System.out.println("-".repeat(60));

    }

}
