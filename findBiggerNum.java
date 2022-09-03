import java.util.Scanner;

public class findBiggerNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int num1= scn.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int num2= scn.nextInt();
        System.out.print("Enter the 3rd Number : ");
        int num3= scn.nextInt();
        System.out.println("The Big Number is : "+ getBigNum(num1,num2,num3));
    }
    public static int getBigNum(int a, int b, int c){
        int lrg = a;
        if (lrg<b ){
            lrg= b;
        }
        if(lrg<c) {
            lrg = c;
        }
        return lrg;
    }
}
