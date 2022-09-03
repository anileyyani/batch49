import java.util.Scanner;

public class fibonicci {

    public static void main(String[] args) {


        // Find the Fibonicci series of a given number.
        Scanner scn = new Scanner(System.in);
        String str= "0";
        int tot=0;
        System.out.print("Find the Fibonicci series of, " );
        int fibo = scn.nextInt();
        for (int i=1; i<=fibo; ++i){
            str=str+ " + " + i;
            tot=tot+i;
        }
        System.out.print("is : "+str+" = "+tot);
    }
}

