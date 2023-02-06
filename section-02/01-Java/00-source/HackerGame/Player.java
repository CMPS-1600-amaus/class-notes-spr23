public class Player extends Character{
    public Player(String name, int health, int baseDamage, String description){
        super(name, health, baseDamage, description);
    } 

    @Override
    public void defend(Character other){
        double chance = rand.nextDouble();
        if(chance <=0.5){
            System.out.println("You spin up your firewall and have time to prepare your next exploit!");
            this.setAsInvincible(rand.nextInt(3)+1);
            this.setTempDamageBuff(2.0);
        } else {
            System.out.println("You fail to start your firewall. You are vulnerable!");
            this.setAsVulnerable(rand.nextInt(3)+1);
        }
    }

    @Override
    public void takeTurn(Character other){
        if(this.isStunned()){
            this.decreaseTurnsStunned();
            System.out.printf("%S is unable to take any actions this turn!", this.getName());
            return;
        }
        System.out.println();
        System.out.printf("%S has %d of %d health.\n", this.getName(), this.getHealth(), this.getMaxHealth());
        System.out.printf("The rogue AI %S has %d health.\n", other.getName(), other.getHealth());
        System.out.printf("Do you want to...\n");
        System.out.printf("  1: Attack?\n");
        System.out.printf("  2: Defend?\n");
        System.out.printf("  3: Repair your gear?\n");
        if(this.hasItems())
            System.out.printf("  4: Use an item?\n");
        System.out.printf("Enter your choice: ");
        //int choice = Integer.parseInt(HackerGame.in.next());
        int choice = HackerGame.in.nextInt();

        if(choice == 1){
            this.attack(other);
        } else if (choice == 2){
            this.defend(other);
        } else if (choice == 3) {
            int hpHealed = rand.nextInt(this.getMaxHealth() - this.getHealth()) + 1;
            this.modifyHealth(hpHealed);
            System.out.printf("%S has repaired their gear for %d points and is now at %d health.\n", 
                                this.getName(),
                                hpHealed,
                                this.getHealth());
        } else if(choice == 4){
            if(hasItems()){
                this.useItem(this, other);
            } else {
                System.out.println("You dig through your bag but find no items. You lose a turn!!");
            }
        }
    }
}