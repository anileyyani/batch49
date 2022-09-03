import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {


        //Find the factorial of a given number.
        Scanner scn = new Scanner(System.in);
        String str= "";

        System.out.print("Factorial value of, " );
        long   factorial = scn.nextInt();
        for ( long i=factorial-1; i>=1; --i){
            str=str+ (i+1)+"X";
            factorial=factorial*i;
        }
        System.out.print("is : "+str+"1 = "+ factorial);
    }
    public static boolean makes10(int a, int b) {
        if (a+b==10 || a==10 || b==10){
            return true;
        }
        return false;
    }
    public static String notString(String str) {
        if (str.length()<3 || !str.substring(0,3).equals("not")  ){
            return ("not "+str);
        }
        return (str);
    }


}

