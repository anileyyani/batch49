import java.util.Scanner;

public class sumnum {

// find the sum of series of numbers
    public static void main(String[] args) {



        // Find the sum of series of natural numbers.
        Scanner scn = new Scanner(System.in);
        System.out.print("Find the sum of number series till, " );
        int num1= scn.nextInt();
        for ( int i=num1-1;i>=1; i--){
            num1 = num1+i;
        }
        System.out.println("is : "+ num1);
    }

}
