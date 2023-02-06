import java.util.Scanner;

public class Hero extends Character {
    private Scanner input;

    public Hero(String name, int health, int attackPower, int chanceToHit){
        super(name, health, attackPower, chanceToHit);
        this.input = new Scanner(System.in);
    }

    public void takeTurn(Character other){
        System.out.printf("%S has %d health.\n", other.getName(), other.getHealth());
        System.out.printf("%S has %d hp.\n",this.getName(), this.getHealth());
        System.out.printf("Would you like to...\n");
        System.out.printf("1) Attack\n");
        System.out.printf("2) Meditate\n");
        System.out.printf("3) Flee\n");
        System.out.printf("Enter your choice: ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                this.attack(other);
                break;
            case 2:
                this.meditate();
                break;
            case 3:
                this.setAsFled();
                break;
        }
    }

    public void meditate(){
        System.out.printf("You got this. We believe in you.\n");
        setNumTurnsVulnerable(1);
        this.takeDamage(-10);
    }
}
