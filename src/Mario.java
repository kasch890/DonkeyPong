public class Mario extends Character implements Hammer{
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
}
