import java.util.Scanner;

public class calc {

    public static void main(String[] args) {



        // Get two numbers with operator give calculated return.  **********************************//
        float num1,num2,num3,num4=0.0f;
        int i=1;
        String s;
        System.out.println("Enter the operator between numbers and return key for calculate");
        Scanner scn = new Scanner(System.in);
        s=scn.next();
        while (s.length()>3 && s.length()>=i ){
            switch(s.substring(i-1,i)){
                case "+":
                    System.out.println(tot(s,i,1));
                    break;
                case "-":
                    System.out.println(tot(s,i,2));
                    break;
                case "*":
                    System.out.println(tot(s,i,3));
                    break;
                case "/":
                    System.out.println(tot(s,i,4));
            }
            i++;
        }

    }
    public static String  tot(String str, int x,int op){
        float num1=   Float.parseFloat(str.substring(0,x-1));
        float num2= Float.parseFloat(str.substring(x));
        switch(op){
            case 1:
                str = "= " + (num1 + num2);
                break;
            case 2:
                str = "= " + (num1 - num2);
                break;
            case 3:
                str =  "= " + (num1 * num2);
                break;
            case 4:
                str =  "= " + (num1 / num2);
                break;
            default:
                str =  " Wrong entry";
        }
        return str;
    }

}

