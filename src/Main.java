public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~ Instantiating game objects ~~~~");
        Character mario = new Mario();
        Character donkeyKong = new DonkeyKong();
        Character pauline = new Pauline();
        System.out.println("~~~~ Start Game ~~~~");
        mario.speak();
        donkeyKong.speak();
        pauline.speak();
    }
    //instantiate things and implement all examples of your code. Some concept of moving would be ideal
    //all main method has to do is it picks the main class that says "go"
    //implement like 10 ticks, you can hard code movement and stuff

}