public class Platform extends GameObject{
    //platforms are what other objects, such as Mario or the rolling barrels, move around on
    public Platform(int x, int y){
        super(x,y);
        System.out.println("Platform created at ("+x+","+y+")...");
    }
}
