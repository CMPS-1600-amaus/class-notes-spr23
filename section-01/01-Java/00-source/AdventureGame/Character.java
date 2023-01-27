import java.util.Random;

public class Character {
    private int health;
    private int attackPower;
    private String name;
    private int chanceToHit;
    private Random rand;

    public Character(String name, int health, int attackPower, int chanceToHit){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.chanceToHit = chanceToHit;
        this.rand = new Random();
    }

    public String toString(){
        String output = "";
        output += getName() + "\n";
        output += "hp: " + getHealth() + "\n";
        output += "attack power: " + getAttackPower() + "\n";
        return output;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public int getChanceToHit(){
        return this.chanceToHit;
    }

    public void attack(Character other) {
        int attackRoll = rand.nextInt(100);
        if(attackRoll < getChanceToHit()){
            System.out.printf("%S slashes at %S for %d damage!\n", this.getName(), other.getName(), this.attackPower);
            other.takeDamage(this.attackPower);
        }
        System.out.printf("%S MISSED!\n",getName());
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive(){
        return this.health >= 0;
    }
}
