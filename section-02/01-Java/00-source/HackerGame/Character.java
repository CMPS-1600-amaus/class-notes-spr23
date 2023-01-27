import java.util.Random;

public class Character {
    private int health;
    private int baseDamage;
    private String name;
    private String description;
    private Random rand;

    public Character(String name, int health, int damage, String description){
        this.name = name;
        this.health = health;
        this.baseDamage = damage;
        this.description = description;
        rand = new Random();
    }

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
        double modifier = rand.nextDouble();
        modifier = (modifier*0.4) + 0.8;
        int damage = (int)(this.baseDamage * modifier);
        String attackMessage = String.format("%S dealt %d damage to %S", 
                                            this.getName(), 
                                            damage, 
                                            other.getName());
        System.out.println(attackMessage);
        other.modifyHealth(-damage);
    }

    public void modifyHealth(int modifier){
        this.health += modifier;
        if(this.health < 0){
            this.health = 0;
        }
    }
}
