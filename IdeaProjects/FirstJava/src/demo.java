import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

    }

    public static void columnAvg(){
        //************* Create an array of 2d with 3 rows and 2 column and get the average of each column   ********//
        boolean flg=true;
        int[][] avgAry = new int[3][5];
        Float avg=0.0f;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                avgAry[i][j]=(int)(Math.random()*100);
                System.out.print(avgAry[i][j]+"\t\t");
                }
            System.out.println();
            System.out.println();
        }
        System.out.println("-".repeat(60));
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                avg += avgAry[i][j];
            }
            System.out.print(Math.round(avg=avg/3)+"\t\t");

        }
        System.out.println();
        System.out.println("-".repeat(60));

    }


    public static void arrayChar(){
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

    public static void decimalAry() {
        //***************************Create and find the sum of array size of 10***************//
        float[] decim = new float[10];
        float tot = 0.0f;
        boolean boo = false;
        System.out.print("Array values 1 to 10--> ");
        for (int j = 1; j <= 2;j++) {
            for (int i = 0; i <= 9; i++) {
                if (!boo) {
                    decim[i] = (float) (Math.random() * 1000);
                }else{
                    tot += decim[i];
                    System.out.print(decim[i] + ", ");
                }
            }
            boo = true;
        }
        System.out.println();
        System.out.println("and the Total is , "+tot);
    }
    public static void arrays() {
        float grd1 = 0, grd2 = 0, grd3 = 0;
        //Creat an array program to store 3 student information and retrive max of each sub and grade of each student.
        int[] sdt1 = new int[5];
        int[] sdt2 = new int[5];
        int[] sdt3 = new int[5];
        String[] max = new String[5];

        for (int i = 0; i <=4; i++) {

            sdt1[i] = (int) (Math.random() * 100);
            sdt2[i] = (int) (Math.random() * 100);
            sdt3[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i <= 4; i++) {
            grd1 += sdt1[1];
            grd1 += sdt1[i];
            grd1 += sdt1[i];
        }

        for (int j=0;j<=4;j++){
            int lrg=sdt1[j];
            max[j]="Student1";
            if (sdt1[j]<sdt2[j]){
                lrg = sdt2[j];
                max[j]="Student2";
            }else if (lrg<sdt3[j]){
                lrg = sdt3[j];
                max[j]="Student3";
            }

        }
        System.out.println("\t\t\t"+"\tSub1\t\tSub2\t\tSub3\t\tSub4\t\tSub5\t\tGrade");
        System.out.println("Student1\t"+"\t"+sdt1[0]+ "\t\t\t"  + sdt1[1] + "\t\t\t"  + sdt1[2] + "\t\t\t"  + sdt1[3] +"\t\t\t"  + sdt1[4] + "\t\t\t" +(grd1/5) );
        System.out.println("Student2\t"+"\t"+sdt2[0]+ "\t\t\t"  + sdt2[1] + "\t\t\t"  + sdt2[2] + "\t\t\t"  + sdt2[3] +"\t\t\t"  + sdt2[4] + "\t\t\t" +(grd2/5));
        System.out.println("Student3\t"+"\t"+sdt3[0]+ "\t\t\t"  + sdt3[1] + "\t\t\t"  + sdt3[2] + "\t\t\t"  + sdt3[3] +"\t\t\t"  + sdt3[4] + "\t\t\t" +(grd3/5));
        System.out.println("Max in Sub\t"+"\t"+max[0]+ "\t"  + max[1] + "\t"  + max[2] + "\t"  + max[3] +"\t"  + max[4] + "\t" );

    }


    public static void random (){
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




    public static void calc(){
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



    public static void  monthFinder(){
        // Find the days in a month from month number.
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the month in number:");
        switch(scn.nextInt()){
            case 1,3,5,7,8,10,12:
                System.out.println("This month have 31 days");
                break;
            case 4,6,9,11:
                System.out.println("This month have 30 days");
                break;
            case 2:
                System.out.println("This month have 28 days");
                break;
            default:
                System.out.println("Wrong entry");
        }
    }
    public static void loop4Number(){
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

    public static void pyramid() {
        prn("Enter a number to build Pyramid :",1);
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        for (int line = 1; line <= row; line=line+2) {
            int mid = (row / 2) + row % 2;
            prn(".", (row-line)/2);
            prn("*", line);
            prn(".", (row-line)/2);
            prn("\n", 1);
        }
    }
    public  static void prn(String s,int x){
        for (int re=1;re<=x;re++) {
            System.out.print(s);
        }
    }

    public static  void sumnum(){

        // Find the sum of series of natural numbers.
        Scanner scn = new Scanner(System.in);
        System.out.print("Find the sum of number series till, " );
        int num1= scn.nextInt();
        for ( int i=num1-1;i>=1; i--){
            num1 = num1+i;
        }
        System.out.println("is : "+ num1);
    }



    public static  void fibonicci(){
        // Find the Fibonicci series of a given number.
        Scanner scn = new Scanner(System.in);
        String str= "0";
        int tot=0;
        System.out.print("Find the Fibonicci series of, " );
        int fibo = scn.nextInt();
        for (int i=1; i<=fibo; ++i){
            str=str+ " + " + i;
            tot=tot+i;
        }
        System.out.print("is : "+str+" = "+tot);
    }


    public static  void factorial(){
        //Find the factorial of a given number.
        Scanner scn = new Scanner(System.in);
        String str= "";

        System.out.print("Factorial value of, " );
        int factorial = scn.nextInt();
        for (int i=factorial-1; i>=1; --i){
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
