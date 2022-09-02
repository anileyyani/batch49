public class coffee {
    /* ***** A class file to make a Coffee in different mode
    with getters, setters, default and parameterized constructors  ****** */

    private int size;
    private int blend;
    private int flavour;

    public int getSize() {
        return size;
    }

    public int getBlend() {
        return blend;
    }

    public int getFlavour() {
        return flavour;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBlend(int blend) {
        this.blend = blend;
    }

    public void setFlavour(int flavour) {
        this.flavour = flavour;
    }

    public coffee(){

    }

    public coffee(int size, int blend,int flavour){
        this.size=size;
        this.blend=blend;
        this.flavour=flavour;
    }

    public String  buildCoffee(){
        String siz[] = new String[5];
        String bln[] = new String[4];
        String fla[] = new String[5];
        siz[1]="Small"; siz[2]="Medium"; siz[3]="Large"; siz[4]="Extra Large";
        bln[1] ="Original Blend"; bln[2] ="Dark Roast"; bln[3] ="Decaf";
        fla[1]="Black"; fla[2]="Regular"; fla[3]="Double Double"; fla[4]="Triple Triple";
        return "~".repeat(40)+"\nORDER NO: XXXXX\nBrewed Coffee\nSize\t\t"+
                siz[size]+
                "\nBlend\t\t"+
                bln[blend]+
                "\nFlavour\t\t"+
                fla[flavour]+"\n"+
            "~".repeat(40);

    }

}
