public class DonkeyKong extends Character{
    public DonkeyKong(){    System.out.println("Donkey Kong created...");
    }
    @Override
    public void speak() {
        System.out.println("DK: The princess is mine!");
    }

    public void throwBarrel(Barrel barrel){
        System.out.println("DK threw a barrel!");
    }
}
