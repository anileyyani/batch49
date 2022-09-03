import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float firstNum = scn.nextFloat();
        System.out.println("Enter the operator ( +, -, *, /");
        String calc = scn.next();
        System.out.println("Enter the second number");
        float secondNum = scn.nextFloat();
        System.out.print("Total = ");
        System.out.println(total(firstNum,secondNum,calc));
    }
    public static Float total(float a , float b,String s){
        float x =0F;
        switch(s){
            case "+":
                x= a+b ;break;
            case "-":
                x= a-b ;break;
            case "*":
                x= a*b ;break;
            case "/":
                x= a/b ;break;
        }
        return x;
    }
}
