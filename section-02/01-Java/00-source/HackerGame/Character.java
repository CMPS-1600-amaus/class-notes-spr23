import java.util.Random;

abstract public class Character {
    private int health;
    private int baseDamage;
    private String name;
    private String description;

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
        this.health = health;
        this.baseDamage = damage;
        this.description = description;
        rand = new Random();
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

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
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

    
}