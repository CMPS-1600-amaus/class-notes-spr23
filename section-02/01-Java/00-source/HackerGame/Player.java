import java.util.Scanner;

public class Player extends Character{
    private Scanner in;
    public Player(String name, int health, int baseDamage, String description){
        super(name, health, baseDamage, description);
        in = new Scanner(System.in);
    } 

    @Override
    public void defend(Character other){
        double chance = rand.nextDouble();
        if(chance <=0.5){
            System.out.println("You spin up your firewall and have time to prepare your next exploit!");
            this.setAsInvincible(1);
            this.setTempDamageBuff(2.0);
        } else {
            System.out.println("You fail to start your firewall. You are vulnerable!");
            this.setAsVulnerable(1);
        }
    }

    public void takeTurn(Character other){
        if(this.isStunned()){
            this.decreaseTurnsStunned();
            System.out.printf("%S is unable to take any actions this turn!", this.getName());
            return;
        }
        System.out.printf("The rogue AI {} has {} health.\n", other.getName(), other.getHealth());
        System.out.printf("Do you want to...\n");
        System.out.printf("Attack? Enter 1\n");
        System.out.printf("Defend? Enter 2\n");
        int choice = in.nextInt();
        if(choice == 1){
            this.attack(other);
        } else if (choice == 2){
            this.defend(other);
        }
    }
}