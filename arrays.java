import java.lang.String;
public class arrays {

    public static void main(String[] args) {

    

        float grd1 = 0f, grd2 = 0f, grd3 = 0f;
        //Creat an array program to store 3 student information and retrieve max of each sub and grade of each student.
        int[] sdt1 = new int[5];
        int[] sdt2 = new int[5];
        int[] sdt3 = new int[5];
        String[] max = new String[5];

        for (int i = 0; i <=4; i++) {

            sdt1[i] = (int) (Math.random() * 100);
            sdt2[i] = (int) (Math.random() * 100);
            sdt3[i] = (int) (Math.random() * 100);

        }
        for (int k = 0; k <= 4; k++) {

            grd1 += sdt1[k];
            grd2 += sdt2[k];
            grd3 += sdt3[k];
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
        System.out.println("\t\t\t"+"\tSub1\t\tSub2\t\tSub3\t\tSub4\t\tSub5\t\tGrade ");
        System.out.println("Student1\t"+"\t"+sdt1[0]+ "\t\t\t"  + sdt1[1] + "\t\t\t"  + sdt1[2] + "\t\t\t"  + sdt1[3] +"\t\t\t"  + sdt1[4] + "\t\t\t" +(grd1/5) );
        System.out.println("Student2\t"+"\t"+sdt2[0]+ "\t\t\t"  + sdt2[1] + "\t\t\t"  + sdt2[2] + "\t\t\t"  + sdt2[3] +"\t\t\t"  + sdt2[4] + "\t\t\t" +(grd2/5));
        System.out.println("Student3\t"+"\t"+sdt3[0]+ "\t\t\t"  + sdt3[1] + "\t\t\t"  + sdt3[2] + "\t\t\t"  + sdt3[3] +"\t\t\t"  + sdt3[4] + "\t\t\t" +(grd3/5));
        System.out.println("Max in Sub\t"+"\t"+max[0]+ "\t"  + max[1] + "\t"  + max[2] + "\t"  + max[3] +"\t"  + max[4] + "\t" );

    }

}
