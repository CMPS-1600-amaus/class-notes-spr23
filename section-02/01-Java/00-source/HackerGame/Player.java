public class Player {
    private int health;
    private int damage;
    private String name;
    private String description;

    public Player(String name, int health, int damage, String description){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.description = description;
    }

    public String toString(){
        String output = "";
        output += "Name " + this.name + "\n";
        output += this.description + "\n";
        output += "hp " + this.health + "\n";
        output += "damage " + this.damage + "\n";
        return output;
    }
}