public class Computer extends Character{

    public Computer(String name, int health, int baseDamage, String description){
        super(name, health, baseDamage, description);
    }


    @Override
    public void defend(Character other){
        // make it conditional on if the player attacks
        double chance = rand.nextDouble();
        if(chance <=0.5){
            System.out.printf("%S creates a matrix simulation which you get lost in...\n", this.getName());
            other.setAsStunned(rand.nextInt(3)+1);
        } else {
            System.out.printf("%S tried to create a matrix simulation but suffered an out of memory error.\n", this.getName());
            this.setAsVulnerable(rand.nextInt(4)+1);
        }
    }

    @Override
    public void takeTurn(Character other){
        if(this.isStunned()){
            this.decreaseTurnsStunned();
            System.out.printf("%S is unable to take any actions this turn!", this.getName());
            return;
        }
        double chanceToAttack = 0.75;
        double healthPercent = ((float)this.getHealth())/this.getMaxHealth();
        if(healthPercent < 0.5) {
            chanceToAttack = 0.38;
        }
        double chance = rand.nextFloat();
        if(chance < chanceToAttack) {
            this.attack(other);
        } else {
            this.defend(other);
        }
    }
}