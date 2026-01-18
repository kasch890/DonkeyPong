public class Ladder extends GameObject{
    //Ladders give mario the ability to climb to different levels in the map
    public Ladder(int x,int y){
        super(x,y);
        System.out.println("Ladder created at ("+x+","+y+")...");
    }


}
