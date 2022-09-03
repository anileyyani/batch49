import java.util.Scanner;

public class random {

    public static void main(String[] args) {

        // Number guessing game using Math.random.************************************//
        for (int i=1;i<=20;i++) {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int valIn = scn.nextInt();
        int rand = (int)(Math.random()*100);
            while (rand == valIn) {
                System.out.println("You Win !!!");
                break;
            }while(rand != valIn){
                System.out.println("The number was " + rand + " Try again");
                break;
            }
        }

    }

}

