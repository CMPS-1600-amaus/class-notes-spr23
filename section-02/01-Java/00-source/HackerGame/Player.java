public class Player {
    private int health;
    private int baseDamage;
    private String name;
    private String description;

    public Player(String name, int health, int damage, String description){
        this.name = name;
        this.health = health;
        this.baseDamage = damage;
        this.description = description;
    }

    public String toString(){
        String output;
        output = "";
        output += "Name " + this.name + "\n";
        output += this.description + "\n";
        output += "hp " + this.health + "\n";
        output += "damage " + this.baseDamage + "\n";
        return output;
    }

    public String getName(){
        return this.name;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public void attack(Computer computer){
        int damage = this.baseDamage;
        String attackMessage = String.format("%S dealt %d damage to %S", 
                                            this.getName(), 
                                            damage, 
                                            computer.getName());
        System.out.println(attackMessage);
        computer.modifyHealth(-damage);
    }

    public void modifyHealth(int modifier){
        this.health += modifier;
        if(this.health < 0){
            this.health = 0;
        }
    }
}