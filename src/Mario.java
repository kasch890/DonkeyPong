public class Mario extends Character implements UseHammer, PlayerMovement{
    //Mario is the player, he can move around and interact with the environment
    private boolean hasHammer;
    private int lives;
    public Mario(int x, int y){
        this(x,y,3);
    }
    public Mario(int x, int y, int lives){
        super(x,y);
        this.lives=lives;
        System.out.println("Mario created at ("+x+","+y+")...");
    }

    @Override
    public void speak() {
        System.out.println("Mario: It's-a me, Mario!");
    }

    @Override
    public void smash() {
        if (hasHammer) {
            System.out.println(" ~ Mario smashed with the hammer!");
        }
    }

    @Override
    public void moveLeft() {
        setX(getX()-1);
        System.out.println(" ~ Mario moved left.");
    }

    @Override
    public void moveRight() {
        setX(getX()+1);
        System.out.println(" ~ Mario moved right.");
    }

    @Override
    public void moveDown() {
        setY(getY()-1);
        System.out.println(" ~ Mario moved down.");
    }

    @Override
    public void climbUp(){
        setY(getY()+1);
        System.out.println(" ~ Mario climbed up.");
    }
    @Override
    public void jump() {
        System.out.println(" ~ Mario jumped.");
    }
    public void pickUpHammer(){
        hasHammer = true;
    }
    public void dropHammer(){
        hasHammer = false;
    }
    public void loseLife() {
        this.lives -= 1;
    }

}
