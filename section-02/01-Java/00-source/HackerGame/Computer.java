public class Computer extends Character{

    public Computer(String name, int health, int baseDamage, String description){
        super(name, health, baseDamage, description);
    }

    
    @Override
    public void defend(Character other){
        // make it conditional on if the player attacks
        double chance = rand.nextDouble();
        if(chance <=0.5){
            System.out.println("{} creates a matrix simulation which you get lost in. You lose a turn.");
            other.setAsStunned(1);
        } else {
            System.out.println("{} tried to create a matrix simulation but suffered an out of memory error.");
            this.setAsVulnerable(2);
        }
    }
}