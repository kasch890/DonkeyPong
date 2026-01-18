public abstract class GameObject {
    //Represents any object that has a position within the game map
    private int x, y;

    public GameObject(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void update(){
        //when certain conditions are met, the gameObject would update
        // relevant variables, such as position
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
}
