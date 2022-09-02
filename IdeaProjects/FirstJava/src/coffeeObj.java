// Create 2 object using default and parameterized constructor
public class coffeeObj {
    public static void main(String[] args) {


        coffee coffee1 = new coffee(randum1(4),randum1(3),randum1(4));
        System.out.println(coffee1.buildCoffee());
        coffee1 = null;

        coffee coffee2 = new coffee();
        coffee2.setSize(randum1(4));
        coffee2.setBlend(randum1(3));
        coffee2.setFlavour(randum1(4));
        coffee2.buildCoffee();
        System.out.println(coffee2.getSize()+"\t"+coffee2.getBlend()+"\t"+coffee2.getFlavour());
    }

    public static int randum1(int max){
        max =(int)(Math.random()*(max+1));
        if (max==0) return 1;
        return max;

        }
}
