import java.util.Random;
import java.util.ArrayList;

abstract public class Character implements Comparable<Character>{
    private int maxHealth;
    private int health;
    private int baseDamage;
    private String name;
    private String description;
    private ArrayList<Consumable> items;

    // Character Conditions:
    private int turnsVulnerable; // number of turns Character is vulnerable
    private int turnsInvincible; // number of turns Character takes no damage
    private int turnsStunned; // number of turns Character gets no actions
    private double tempDamageBuff; // buffer factor for next attack

    // protected means that the feature is accessible to all subclasses and to
    // everything in the same package.
    protected Random rand;

    public Character(String name, int health, int damage, String description){
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.baseDamage = damage;
        this.description = description;
        this.tempDamageBuff = 1.0;
        rand = new Random();
        items = new ArrayList<Consumable>();
    }

    @Override
    public String toString(){
        String output;
        output = "";
        output += "Name " + getName() + "\n";
        output += getDescription() + "\n";
        output += "hp " + getHealth() + "\n";
        output += "damage " + getBaseDamage() + "\n";
        return output;
    }

    @Override
    public int compareTo(Character other){
        if(this.getHealth() < other.getHealth()){
            return -1;
        } else if(this.getHealth() < other.getHealth()){
            return 1;
        }
        return 0;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getBaseDamage(){
        return this.baseDamage;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    abstract void takeTurn(Character other);

    public void attack(Character other){
        if(other.isInvincible()){
            System.out.printf("%S is unable to attack %S!\n", 
                                this.getName(), 
                                other.getName());
            other.decreaseTurnsInvincible();
            return;
        }
        double modifier = rand.nextDouble();
        modifier = (modifier*0.4) + 0.8;
        int damage = (int)(this.baseDamage * modifier);
        // apply temporary damage buff, then reset it back to 1.0
        damage *= this.tempDamageBuff;
        this.tempDamageBuff = 1.0;

        if(other.isVulnerable()){
            damage *= 1.5;
            other.decreaseTurnsVulnerable();
        }

        System.out.printf("%S dealt %d damage to %S\n", 
                            this.getName(), 
                            damage, 
                            other.getName());
        other.modifyHealth(-damage);
    }

    // defend() is abstract since we want both Player and Computer to be able to
    // defend even though they will do so differently. We don't have a valid
    // implementation at the Character level, so we make the method abstract.
    abstract public void defend(Character other);
    
    public void modifyHealth(int modifier){
        this.health += modifier;
        if(this.health < 0){
            this.health = 0;
        }
    }

    public void setAsVulnerable(int numTurns){
        this.turnsVulnerable = numTurns;
    }

    public boolean isVulnerable(){
        return this.turnsVulnerable > 0;
    }

    public void decreaseTurnsVulnerable(){
        this.turnsVulnerable--;
    }

    public void setAsInvincible(int numTurns){
        this.turnsInvincible = numTurns;
    }

    public boolean isInvincible(){
        return this.turnsInvincible > 0;
    }

    public void decreaseTurnsInvincible(){
        this.turnsInvincible--;
    }

    public void setAsStunned(int numTurns){
        this.turnsStunned = numTurns;
    }

    public boolean isStunned(){
        return this.turnsStunned > 0;
    }

    public void decreaseTurnsStunned(){
        this.turnsStunned--;
    }

    /**
     * Set the temporary damage buffer. This is a multiplicative
     * factor which will modify the damage for the next attack made
     * by this Character.
     * 
     * @param buff the multiplicative factor for the next
     * attack's damage.
     */
    public void setTempDamageBuff(double buff){
        this.tempDamageBuff = buff;
    }

    public void obtain(Consumable item){
        items.add(item);
    }

    public void useItem(Character owner, Character other){
        int i = 1;
        System.out.printf("  Do you want to use:\n");
        for(Consumable item : items){
            System.out.printf("    %d: %S\n", i, item);
            i++;
        }
        System.out.print("  Enter your choice: ");
        int choice = HackerGame.in.nextInt();
        items.get(choice-1).consume(owner, other);
        items.remove(choice-1);
    }

    public boolean hasItems(){
        return !items.isEmpty();
    }
}
