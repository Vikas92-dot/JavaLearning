package Abstract_class;

public class Wizard extends GameCharacter {
    private int magicPower;
    

    public Wizard(int magicPower) {
        this.magicPower = magicPower;
    }
    void attack(){
        System.out.println("Attack: Casts spell, deals "+(magicPower*2)+" magical damage!");
    }
    void defend(){
        System.out.println("Defend: Creates magical barrier, defence boosted by "+magicPower);
    }
}



