public class Pauline extends Character{
    public Pauline(int x, int y){
        this.x =x;
        this.y = y;
        System.out.println("Pauline created at ("+x+","+y+")...");
    }

    @Override
    public void speak() {
        System.out.println("Pauline: Save me Mario!");
    }
}
