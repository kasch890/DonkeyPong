public class Barrel extends GameObject{
    //Barrels are thrown by donkey kong and roll until they break, reach the end
    //of the map, or hit mario
    public Barrel(int x, int y){
        super(x,y);
        System.out.println("Barrel created at ("+x+","+y+")...");

    }

    public void roll(){
        System.out.println("Barrel has rolled forward");
    }

}
