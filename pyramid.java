import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {
        prn("Enter a number to build Pyramid :",1);
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        for (int line = 1; line <= row; line=line+2) {
            int mid = (row / 2) + row % 2;
            prn(".", (row-line)/2);
            prn("*", line);
            prn(".", (row-line)/2);
            prn("\n", 1);
        }
    }
    public  static void prn(String s,int x){
        for (int re=1;re<=x;re++) {
            System.out.print(s);
        }
    }
}
