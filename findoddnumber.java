import java.util.Scanner;

public class findoddnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number for validation : ");
        int num1 = scn.nextInt();
        String string1;
        if (num1!=0 && num1%2 == 0){
            string1 = "an Even";
        } else if (num1==0) {
            string1 = "a Neutral";
        }else {
            string1 = "an Odd";
        }
        System.out.println("Its "+ string1 + " Number");
    }
}
