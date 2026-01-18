public class Pauline extends Character{
    //Pauline is the location for the end goal for each level
    public Pauline(int x, int y){
        super(x,y);
        System.out.println("Pauline created at ("+x+","+y+")...");
    }

    @Override
    public void speak() {
        System.out.println("Pauline: Save me Mario!");
    }
}
