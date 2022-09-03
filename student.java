public class student {


    private float grd1 = 0.0F;
    float grd2 = 0.0F;
    float grd3 = 0.0F;
    int[] sdt1 = new int[5];
    int[] sdt2 = new int[5];
    int[] sdt3 = new int[5];
    String[] max = new String[5];

    void arrays1() {
        int j;
        for (j = 0; j <= 4; ++j) {
            sdt1[j] = (int) (Math.random() * 100.0);
            sdt2[j] = (int) (Math.random() * 100.0);
            sdt3[j] = (int) (Math.random() * 100.0);
        }

        for (j = 0; j <= 4; ++j) {
            grd1 += (float) sdt1[1];
            grd1 += (float) sdt1[j];
            grd1 += (float) sdt1[j];
        }

        for (j = 0; j <= 4; ++j) {
            int lrg = sdt1[j];
            max[j] = "Student1";
            int var10000;
            if (sdt1[j] < sdt2[j]) {
                var10000 = sdt2[j];
                max[j] = "Student2";
            } else if (lrg < sdt3[j]) {
                var10000 = sdt3[j];
                max[j] = "Student3";
            }
        }

        System.out.println("\t\t\t\tSub1\t\tSub2\t\tSub3\t\tSub4\t\tSub5\t\tGrade");
        System.out.println("Student1\t\t" + sdt1[0] + "\t\t\t" + sdt1[1] + "\t\t\t" + sdt1[2] + "\t\t\t" + sdt1[3] + "\t\t\t" + sdt1[4] + "\t\t\t" + grd1 / 5.0F);
        System.out.println("Student2\t\t" + sdt2[0] + "\t\t\t" + sdt2[1] + "\t\t\t" + sdt2[2] + "\t\t\t" + sdt2[3] + "\t\t\t" + sdt2[4] + "\t\t\t" + grd2 / 5.0F);
        System.out.println("Student3\t\t" + sdt3[0] + "\t\t\t" + sdt3[1] + "\t\t\t" + sdt3[2] + "\t\t\t" + sdt3[3] + "\t\t\t" + sdt3[4] + "\t\t\t" + grd3 / 5.0F);
        System.out.println("Max in Sub\t\t" + max[0] + "\t" + max[1] + "\t" + max[2] + "\t" + max[3] + "\t" + max[4] + "\t");

    }
}