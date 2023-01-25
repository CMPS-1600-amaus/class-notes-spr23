public class Monster {
    private int health;
    private int attackPower;
    private String name;

    public Monster(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String toString(){
        String output = "";
        output += "Monster " + this.name + "\n";
        output += "hp: " + this.health + "\n";
        output += "attack power: " + this.attackPower + "\n";
        return output;
    }

    public String getName(){
        return this.name;
    }

    public void attack(Hero hero) {
        String attackMessage = String.format("%S slashes at %S", this.getName(), hero.getName());
        System.out.println(attackMessage);
        hero.takeDamage(this.attackPower);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
