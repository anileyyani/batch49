import java.util.Scanner;

public class loop4Number {

    public static void main(String[] args) {


 // Printing 1-100 whole number , even number and odd number and total sum using while loop and switch.
        int i=1,od=0,evn=0;
        prn1(" List of numbers from 1 to 100");

        prn1(" | Natural | Odd     | Even    |")   ;

        while(i<=100) {
            switch(i%2){
                case 0 :prn1("\t"+i+"\t\t\t\t\t"+i);
                evn +=i;
                    break;
                case 1 :prn1("\t"+i+"\t\t"+i);
                od +=i;
            }
            i++;
        }
        prn1("~".repeat(50));
        prn1("\t"+(evn+od)+"\t"+od+"\t"+evn);
        prn1("~".repeat(50));

    }
    public static void prn1 (String s){
        System.out.println(s);
    }
}
