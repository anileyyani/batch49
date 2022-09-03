import java.util.Scanner;

public class arrayChar {

    public static void main(String[] args) {


        //*********  Get the name and store in array of char   **************************//
        System.out.println("Enter your name to save in Char Array... ");
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        char namAry[] = new char[s1.length()];
        System.out.print("[ ");
        for(int i=0;i<=(s1.length()-1);i++){
            namAry[i]= s1 .charAt(i);

            System.out.print(namAry[i]+" ");
        }
        System.out.println("]");
    }
}
