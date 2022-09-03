import java.util.Scanner;

public class findTiveNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int Num1 = scn.nextInt();
        System.out.print("Largest of Three Numbers : ");
        System.out.println(findTive(Num1));
    }
    public static String findTive(int a) {
        String s = "Positive";
        if ( a<0) {
            s = "Negative";
        }else if (a==0){
            s="Neutral value";
            }
        return s;
    }
}
