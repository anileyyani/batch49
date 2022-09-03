import java.util.Scanner;

public class decimalAry {

    public static void main(String[] args) {

        //***************************Create and find the sum of array size of 10***************//
        float[] decim = new float[10];
        float tot = 0.0f;
        boolean boo = false;
        System.out.print("Array values 1 to 10--> ");
        for (int j = 1; j <= 2;j++) {
            for (int i = 0; i <= 9; i++) {
                if (!boo) {
                    decim[i] = (float) (Math.random() * 1000);
                }else{
                    tot += decim[i];
                    System.out.print(decim[i] + ", ");
                }
            }
            boo = true;
        }
        System.out.println();
        System.out.println("and the Total is , "+tot);
    }

}
