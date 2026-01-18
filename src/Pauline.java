public class Pauline extends Character{
    public Pauline(int x, int y){
        super(x,y);
        System.out.println("Pauline created at ("+x+","+y+")...");
    }

    @Override
    public void speak() {
        System.out.println("Pauline: Save me Mario!");
    }
}
