public class Monster extends Character{

    public Monster(String name, int health, int attackPower, int chanceToHit){
        super(name, health, attackPower, chanceToHit);
    }

    public void takeTurn(Character other){
        this.attack(other);
    }
}