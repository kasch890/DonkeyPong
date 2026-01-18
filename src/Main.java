public class Main {
    public static void run(){
        System.out.println("~~~~ Instantiating game objects ~~~~");
        Character mario = new Mario(10,20);
        Character donkeyKong = new DonkeyKong(10,80);
        Character pauline = new Pauline(14, 80);
        GameObject barrel = new Barrel();
        System.out.println("~~~~ Start Game ~~~~");
        mario.speak();
        donkeyKong.speak();
        pauline.speak();
        ((Mario) mario).moveRight();
        ((Mario) mario).moveRight();
        ((DonkeyKong) donkeyKong).throwBarrel((Barrel)barrel);
        ((Mario) mario).jump();
    }
    public static void main(String[] args) {
        run();
    }
    //instantiate things and implement all examples of your code. Some concept of moving would be ideal
    //all main method has to do is it picks the main class that says "go"
    //implement like 10 ticks, you can hard code movement and stuff

}