import java.util.Scanner;

public class Hero extends Character {
    private Scanner input;
    private boolean fledFlag;

    public Hero(String name, int health, int attackPower, int chanceToHit){
        super(name, health, attackPower, chanceToHit);
        this.fledFlag = false;
    }

    public void takeTurn(Character other){
        System.out.printf("%S has %d health.\n", other.getName(), other.getHealth());
        System.out.printf("Would you like to...\n");
        System.out.printf("1) Attack\n");
        System.out.printf("2) Meditate\n");
        System.out.printf("3) Flee\n");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                this.attack(other);
            case 2:
                this.meditate();
            case 3:
                this.fledFlag = true;
        }

        this.attack(other);
    }

    public boolean hasFled(){
        return this.fledFlag;
    }

    public void meditate(){
        System.out.printf("You got this. We believe in you.\n");
        this.takeDamage(-10);
    }
}
