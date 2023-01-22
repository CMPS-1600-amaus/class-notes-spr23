public class Hero {
    private int health;
    private int attackPower;
    private String name;

    public Hero(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String toString(){
        String output = "";
        output += "Hero " + this.name + "\n";
        output += "hp: " + this.health + "\n";
        output += "attack power: " + this.attackPower + "\n";
        return output;
    }
}
