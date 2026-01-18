public abstract class Character extends GameObject {
//each character has a position inherited from GameObject and has the ability to speak

    public Character(int x, int y){
        super(x,y);
    }
    public abstract void speak();

}
