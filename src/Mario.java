public class Mario extends Character implements UseHammer, playerMovement{
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
        System.out.println(" ~ Mario moved left.");
    }

    @Override
    public void moveRight() {
        System.out.println(" ~ Mario moved right.");
    }

    @Override
    public void moveDown() {
        System.out.println(" ~ Mario moved down.");
    }

    @Override
    public void climbUp(){
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
