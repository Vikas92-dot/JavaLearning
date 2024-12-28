package Abstract_class;

public class Warrior extends GameCharacter {
	private int strength;

    public Warrior(int strength) {
        this.strength = strength;
    }
    void attack(){
        System.out.println("Attack: Powerful sword slash for "+(strength*3)+" damage!");
    }
    void defend(){
        System.out.println("Defend: Raises shield, defence boosted by "+strength);
    }

}
