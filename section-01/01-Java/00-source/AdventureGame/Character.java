import java.util.ArrayList;

abstract public class Character {
    private int health;
    private int attackPower;
    private String name;
    private int chanceToHit;
    private int numTurnsVulnerable;
    private int numTurnsInvulnerable;
    private boolean fledFlag;
    private Weapon weapon;
    private ArrayList<Consumable> items;

    public Character(String name, int health, int attackPower, int chanceToHit){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.chanceToHit = chanceToHit;
        this.numTurnsVulnerable = 0;
        this.numTurnsInvulnerable = 0;
        this.fledFlag = false;
        this.weapon = new Weapon("Sword", "slashes", 6, this);
        this.items = new ArrayList<Consumable>();
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

    public void giveItem(Consumable item){
        this.items.add(item);
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

    public int getNumTurnsInvulnerable(){
        return this.numTurnsInvulnerable;
    }

    public void setNumTurnsInvulnerable(int numTurns){
        this.numTurnsInvulnerable = numTurns;
    }

    public boolean isInvulnerable(){
        return this.numTurnsInvulnerable > 0;
    }

    public void decrementTurnsVulnerable(){
        this.numTurnsVulnerable--;
    }

    public void decrementTurnsInvulnerable(){
        this.numTurnsInvulnerable--;
    }

    abstract public void takeTurn(Character other);

    public void attack(Character other) {
        Weapon weapon = this.chooseWeapon();
        weapon.attack(other);
    }

    public void modifyHealth(int hp) {
        this.health += hp;
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

    public void kill(){
        this.health = 0;
    }
}
