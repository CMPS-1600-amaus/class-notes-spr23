import java.util.Random;

abstract public class Character {
    private int health;
    private int attackPower;
    private String name;
    private int chanceToHit;
    private Random rand;
    private int numTurnsVulnerable;
    private boolean fledFlag;
    private Weapon weapon;

    public Character(String name, int health, int attackPower, int chanceToHit){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.chanceToHit = chanceToHit;
        this.numTurnsVulnerable = 0;
        this.rand = new Random();
        this.fledFlag = false;
        this.weapon = new Weapon("Sword", "slashes", 6, this);
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

    public Weapon getWeapon(){
        return this.weapon;
    }

    public Weapon chooseWeapon(){
        // choose the weapon to use
        return this.weapon;
    }

    public int getChanceToHit(){
        return this.chanceToHit;
    }

    public int getNumTurnsVulnerable(){
        return this.numTurnsVulnerable;
    }

    public void setNumTurnsVulnerable(int numTurns){
        this.numTurnsVulnerable = numTurns;
    }

    public boolean isVulnerable(){
        return this.numTurnsVulnerable > 0;
    }

    public void decrementTurnsVulnerable(){
        this.numTurnsVulnerable--;
    }

    abstract public void takeTurn(Character other);

    public void attack(Character other) {
        Weapon weapon = this.chooseWeapon();
        weapon.attack(other);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public boolean hasFled(){
        return this.fledFlag;
    }

    public void setAsFled(){
        this.fledFlag = true;
    }
}
