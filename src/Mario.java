public class Mario extends Character implements Hammer, Movement{
    public int x, y;
    public Mario(){
        System.out.println("Mario created...");
    }

    @Override
    public void speak() {
        System.out.println("Mario: It's-a me, Mario!");
    }

    @Override
    public void smash() {
        System.out.println("Mario smashed with the hammer!");
    }

    @Override
    public void moveLeft() {
        this.x -=1;
        System.out.println("Mario moved left.");
    }

    @Override
    public void moveRight() {
        this.x +=1;
        System.out.println("Mario moved right.");
    }

    @Override
    public void moveDown() {

        System.out.println("Mario moved down.");
    }

    @Override
    public void climbUp(){
        this.y +=1;
        System.out.println("Mario climbed up.");
    }
    @Override
    public void jump() {
        System.out.println("Mario jumped.");
    }
}
