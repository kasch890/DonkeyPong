public class DonkeyKong extends Character{
    public DonkeyKong(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("Donkey Kong created at ("+x+","+y+")...");
    }
    @Override
    public void speak() {
        System.out.println("DK: The princess is mine!");
    }

    public void throwBarrel(Barrel barrel){
        System.out.println(" ~ DK threw a barrel!");
    }
}
