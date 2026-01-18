public class Main {
    public static void run(){
        System.out.println("~~~~ Instantiating game objects ~~~~");
        Mario mario = new Mario(10, 20);
        DonkeyKong donkeyKong = new DonkeyKong(10, 80);
        Pauline pauline = new Pauline(14, 80);
        Barrel barrel = new Barrel(11, 80);

        System.out.println("~~~~ Start Game ~~~~");
        mario.speak();
        donkeyKong.speak();
        pauline.speak();
        mario.moveRight();
        mario.moveRight();
        donkeyKong.throwBarrel(barrel);
        mario.jump();
        mario.pickUpHammer();
        mario.smash();

    }
    public static void main(String[] args) {
        run();
    }

}